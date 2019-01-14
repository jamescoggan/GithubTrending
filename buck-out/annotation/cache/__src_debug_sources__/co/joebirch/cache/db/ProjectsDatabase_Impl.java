package co.joebirch.cache.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import co.joebirch.cache.dao.CachedProjectsDao;
import co.joebirch.cache.dao.CachedProjectsDao_Impl;
import co.joebirch.cache.dao.ConfigDao;
import co.joebirch.cache.dao.ConfigDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class ProjectsDatabase_Impl extends ProjectsDatabase {
  private volatile CachedProjectsDao _cachedProjectsDao;

  private volatile ConfigDao _configDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `projects` (`project_id` TEXT NOT NULL, `name` TEXT NOT NULL, `fullName` TEXT NOT NULL, `starCount` TEXT NOT NULL, `dateCreated` TEXT NOT NULL, `ownerName` TEXT NOT NULL, `ownerAvatar` TEXT NOT NULL, `is_bookmarked` INTEGER NOT NULL, PRIMARY KEY(`project_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `lastCacheTime` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"84f7890e0b42dc4388898581ef475c53\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `projects`");
        _db.execSQL("DROP TABLE IF EXISTS `config`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProjects = new HashMap<String, TableInfo.Column>(8);
        _columnsProjects.put("project_id", new TableInfo.Column("project_id", "TEXT", true, 1));
        _columnsProjects.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsProjects.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0));
        _columnsProjects.put("starCount", new TableInfo.Column("starCount", "TEXT", true, 0));
        _columnsProjects.put("dateCreated", new TableInfo.Column("dateCreated", "TEXT", true, 0));
        _columnsProjects.put("ownerName", new TableInfo.Column("ownerName", "TEXT", true, 0));
        _columnsProjects.put("ownerAvatar", new TableInfo.Column("ownerAvatar", "TEXT", true, 0));
        _columnsProjects.put("is_bookmarked", new TableInfo.Column("is_bookmarked", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProjects = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProjects = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProjects = new TableInfo("projects", _columnsProjects, _foreignKeysProjects, _indicesProjects);
        final TableInfo _existingProjects = TableInfo.read(_db, "projects");
        if (! _infoProjects.equals(_existingProjects)) {
          throw new IllegalStateException("Migration didn't properly handle projects(co.joebirch.cache.model.CachedProject).\n"
                  + " Expected:\n" + _infoProjects + "\n"
                  + " Found:\n" + _existingProjects);
        }
        final HashMap<String, TableInfo.Column> _columnsConfig = new HashMap<String, TableInfo.Column>(2);
        _columnsConfig.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsConfig.put("lastCacheTime", new TableInfo.Column("lastCacheTime", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysConfig = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesConfig = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoConfig = new TableInfo("config", _columnsConfig, _foreignKeysConfig, _indicesConfig);
        final TableInfo _existingConfig = TableInfo.read(_db, "config");
        if (! _infoConfig.equals(_existingConfig)) {
          throw new IllegalStateException("Migration didn't properly handle config(co.joebirch.cache.model.Config).\n"
                  + " Expected:\n" + _infoConfig + "\n"
                  + " Found:\n" + _existingConfig);
        }
      }
    }, "84f7890e0b42dc4388898581ef475c53");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "projects","config");
  }

  @Override
  public CachedProjectsDao cachedProjectsDao() {
    if (_cachedProjectsDao != null) {
      return _cachedProjectsDao;
    } else {
      synchronized(this) {
        if(_cachedProjectsDao == null) {
          _cachedProjectsDao = new CachedProjectsDao_Impl(this);
        }
        return _cachedProjectsDao;
      }
    }
  }

  @Override
  public ConfigDao configDao() {
    if (_configDao != null) {
      return _configDao;
    } else {
      synchronized(this) {
        if(_configDao == null) {
          _configDao = new ConfigDao_Impl(this);
        }
        return _configDao;
      }
    }
  }
}
