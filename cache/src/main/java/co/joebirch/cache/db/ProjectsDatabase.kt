package co.joebirch.cache.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import co.joebirch.cache.dao.CachedProjectsDao
import co.joebirch.cache.model.CachedProject
import javax.inject.Inject

@Database(entities = arrayOf(CachedProject::class), version = 1)
abstract class ProjectsDatabase @Inject constructor(): RoomDatabase() {

    abstract fun cachedProjectsDao(): CachedProjectsDao

    private var INSTANCE: ProjectsDatabase? = null
    private val lock = Any()

    fun getInstance(context: Context): ProjectsDatabase {
        if (INSTANCE == null) {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            ProjectsDatabase::class.java, "projects.db")
                            .build()
                }
                return INSTANCE as ProjectsDatabase
            }
        }
        return INSTANCE as ProjectsDatabase
    }

}