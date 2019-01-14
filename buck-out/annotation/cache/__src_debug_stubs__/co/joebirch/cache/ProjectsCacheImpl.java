package co.joebirch.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lco/joebirch/cache/ProjectsCacheImpl;", "Lco/joebirch/data/repository/ProjectsCache;", "projectsDatabase", "Lco/joebirch/cache/db/ProjectsDatabase;", "mapper", "Lco/joebirch/cache/mapper/CachedProjectMapper;", "(Lco/joebirch/cache/db/ProjectsDatabase;Lco/joebirch/cache/mapper/CachedProjectMapper;)V", "areProjectsCached", "Lio/reactivex/Single;", "", "clearProjects", "Lio/reactivex/Completable;", "getBookmarkedProjects", "Lio/reactivex/Flowable;", "", "Lco/joebirch/data/model/ProjectEntity;", "getProjects", "isProjectsCacheExpired", "saveProjects", "projects", "setLastCacheTime", "lastCache", "", "setProjectAsBookmarked", "projectId", "", "setProjectAsNotBookmarked", "src_debug"})
public final class ProjectsCacheImpl implements co.joebirch.data.repository.ProjectsCache {
    private final co.joebirch.cache.db.ProjectsDatabase projectsDatabase = null;
    private final co.joebirch.cache.mapper.CachedProjectMapper mapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable clearProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable saveProjects(@org.jetbrains.annotations.NotNull()
    java.util.List<co.joebirch.data.model.ProjectEntity> projects) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<co.joebirch.data.model.ProjectEntity>> getProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<co.joebirch.data.model.ProjectEntity>> getBookmarkedProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable setProjectAsBookmarked(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable setProjectAsNotBookmarked(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Boolean> areProjectsCached() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable setLastCacheTime(long lastCache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Boolean> isProjectsCacheExpired() {
        return null;
    }
    
    @javax.inject.Inject()
    public ProjectsCacheImpl(@org.jetbrains.annotations.NotNull()
    co.joebirch.cache.db.ProjectsDatabase projectsDatabase, @org.jetbrains.annotations.NotNull()
    co.joebirch.cache.mapper.CachedProjectMapper mapper) {
        super();
    }
}