package co.joebirch.cache.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lco/joebirch/cache/dao/CachedProjectsDao;", "", "()V", "deleteProjects", "", "getBookmarkedProjects", "Lio/reactivex/Flowable;", "", "Lco/joebirch/cache/model/CachedProject;", "getProjects", "insertProjects", "projects", "setBookmarkStatus", "isBookmarked", "", "projectId", "", "src_debug"})
public abstract class CachedProjectsDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM projects")
    public abstract io.reactivex.Flowable<java.util.List<co.joebirch.cache.model.CachedProject>> getProjects();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertProjects(@org.jetbrains.annotations.NotNull()
    java.util.List<co.joebirch.cache.model.CachedProject> projects);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM projects")
    public abstract void deleteProjects();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM projects WHERE is_bookmarked = 1")
    public abstract io.reactivex.Flowable<java.util.List<co.joebirch.cache.model.CachedProject>> getBookmarkedProjects();
    
    @android.arch.persistence.room.Query(value = "UPDATE projects SET is_bookmarked = :isBookmarked WHERE project_id = :projectId")
    public abstract void setBookmarkStatus(boolean isBookmarked, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId);
    
    public CachedProjectsDao() {
        super();
    }
}