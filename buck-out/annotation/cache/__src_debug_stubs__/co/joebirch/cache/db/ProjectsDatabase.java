package co.joebirch.cache.db;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {co.joebirch.cache.model.CachedProject.class, co.joebirch.cache.model.Config.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lco/joebirch/cache/db/ProjectsDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "cachedProjectsDao", "Lco/joebirch/cache/dao/CachedProjectsDao;", "configDao", "Lco/joebirch/cache/dao/ConfigDao;", "Companion", "src_debug"})
public abstract class ProjectsDatabase extends android.arch.persistence.room.RoomDatabase {
    private static co.joebirch.cache.db.ProjectsDatabase INSTANCE;
    private static final java.lang.Object lock = null;
    public static final co.joebirch.cache.db.ProjectsDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract co.joebirch.cache.dao.CachedProjectsDao cachedProjectsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract co.joebirch.cache.dao.ConfigDao configDao();
    
    @javax.inject.Inject()
    public ProjectsDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lco/joebirch/cache/db/ProjectsDatabase$Companion;", "", "()V", "INSTANCE", "Lco/joebirch/cache/db/ProjectsDatabase;", "lock", "getInstance", "context", "Landroid/content/Context;", "src_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final co.joebirch.cache.db.ProjectsDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}