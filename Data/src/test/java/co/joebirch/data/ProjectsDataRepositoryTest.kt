package co.joebirch.data

import co.joebirch.data.mapper.ProjectMapper
import co.joebirch.data.model.ProjectEntity
import co.joebirch.data.repository.ProjectsCache
import co.joebirch.data.repository.ProjectsDataStore
import co.joebirch.data.store.ProjectsDataStoreFactory
import co.joebirch.data.test.factory.DataFactory
import co.joebirch.data.test.factory.ProjectFactory
import co.joebirch.domain.model.Project
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ProjectsDataRepositoryTest {

    private val mapper = mock<ProjectMapper>()
    private val factory = mock<ProjectsDataStoreFactory>()
    private val store = mock<ProjectsDataStore>()
    private val cache = mock<ProjectsCache>()
    private val repository = ProjectsDataRepository(mapper, cache, factory)

    @Before
    fun setup() {
        stubFactoryGetDataStore()
        stubFactoryGetCacheDataStore()
        stubIsCacheExpired(Flowable.just(false))
        stubAreProjectsCached(Single.just(false))
        stubSaveProjects(Completable.complete())
    }

    @Test
    fun getProjectsCompletes() {
        stubGetProjects(Flowable.just(listOf(ProjectFactory.makeProjectEntity())))
        stubMapper(ProjectFactory.makeProject(), any())

        val testObserver = repository.getProjects().test()
        testObserver.assertComplete()
    }

    @Test
    fun getProjectsReturnsData() {
        val projectEntity = ProjectFactory.makeProjectEntity()
        val project = ProjectFactory.makeProject()
        stubGetProjects(Flowable.just(listOf(projectEntity)))
        stubMapper(project, projectEntity)

        val testObserver = repository.getProjects().test()
        testObserver.assertValue(listOf(project))
    }

    @Test
    fun getBookmarkedProjectsCompletes() {
        stubGetBookmarkedProjects(Flowable.just(listOf(ProjectFactory.makeProjectEntity())))
        stubMapper(ProjectFactory.makeProject(), any())

        val testObserver = repository.getBookmarkedProjects().test()
        testObserver.assertComplete()
    }

    @Test
    fun getBookmarkedProjectsReturnsData() {
        val projectEntity = ProjectFactory.makeProjectEntity()
        val project = ProjectFactory.makeProject()
        stubGetBookmarkedProjects(Flowable.just(listOf(projectEntity)))
        stubMapper(project, projectEntity)

        val testObserver = repository.getBookmarkedProjects().test()
        testObserver.assertValue(listOf(project))
    }

    @Ignore
    fun bookmarkProjectCompletes() {
        stubBookmarkProject(Completable.complete())

        val testObserver = repository.bookmarkProject(DataFactory.randomString()).test()
        testObserver.assertComplete()
    }

    @Ignore
    fun unbookmarkProjectCompletes() {
        stubUnBookmarkProject(Completable.complete())

        val testObserver = repository.unbookmarkProject(DataFactory.randomString()).test()
        testObserver.assertComplete()
    }

    private fun stubBookmarkProject(completable: Completable) {
        whenever(cache.setProjectAsBookmarked(any()))
                .thenReturn(completable)
    }

    private fun stubUnBookmarkProject(completable: Completable) {
        whenever(cache.setProjectAsNotBookmarked(any()))
                .thenReturn(completable)
    }

    private fun stubIsCacheExpired(single: Flowable<Boolean>) {
        whenever(cache.isProjectsCacheExpired())
                .thenReturn(single)
    }

    private fun stubAreProjectsCached(single: Single<Boolean>) {
        whenever(cache.areProjectsCached())
                .thenReturn(single)
    }

    private fun stubMapper(model: Project, entity: ProjectEntity) {
        whenever(mapper.mapFromEntity(entity))
                .thenReturn(model)
    }

    private fun stubGetProjects(observable: Flowable<List<ProjectEntity>>) {
        whenever(store.getProjects())
                .thenReturn(observable)
    }

    private fun stubGetBookmarkedProjects(observable: Flowable<List<ProjectEntity>>) {
        whenever(store.getBookmarkedProjects())
                .thenReturn(observable)
    }

    private fun stubFactoryGetDataStore() {
        whenever(factory.getDataStore(any(), any()))
                .thenReturn(store)
    }

    private fun stubFactoryGetCacheDataStore() {
        whenever(factory.getCacheDataStore())
                .thenReturn(store)
    }

    private fun stubSaveProjects(completable: Completable) {
        whenever(store.saveProjects(any()))
                .thenReturn(completable)
    }

}