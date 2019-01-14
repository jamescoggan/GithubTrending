package co.joebirch.cache.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.database.Cursor;
import co.joebirch.cache.model.Config;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class ConfigDao_Impl extends ConfigDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfConfig;

  public ConfigDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfConfig = new EntityInsertionAdapter<Config>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `config`(`id`,`lastCacheTime`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Config value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getLastCacheTime());
      }
    };
  }

  @Override
  public void insertConfig(Config config) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfConfig.insert(config);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flowable<Config> getConfig() {
    final String _sql = "SELECT * FROM config";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"config"}, new Callable<Config>() {
      public Config call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfLastCacheTime = _cursor.getColumnIndexOrThrow("lastCacheTime");
          final Config _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final long _tmpLastCacheTime;
            _tmpLastCacheTime = _cursor.getLong(_cursorIndexOfLastCacheTime);
            _result = new Config(_tmpId,_tmpLastCacheTime);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
