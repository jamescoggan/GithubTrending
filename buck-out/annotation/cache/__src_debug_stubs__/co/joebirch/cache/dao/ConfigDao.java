package co.joebirch.cache.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lco/joebirch/cache/dao/ConfigDao;", "", "()V", "getConfig", "Lio/reactivex/Flowable;", "Lco/joebirch/cache/model/Config;", "insertConfig", "", "config", "src_debug"})
public abstract class ConfigDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM config")
    public abstract io.reactivex.Flowable<co.joebirch.cache.model.Config> getConfig();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertConfig(@org.jetbrains.annotations.NotNull()
    co.joebirch.cache.model.Config config);
    
    public ConfigDao() {
        super();
    }
}