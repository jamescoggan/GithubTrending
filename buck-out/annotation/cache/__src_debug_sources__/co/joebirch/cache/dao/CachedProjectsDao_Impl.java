package co.joebirch.cache.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import co.joebirch.cache.model.CachedProject;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class CachedProjectsDao_Impl extends CachedProjectsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCachedProject;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProjects;

  private final SharedSQLiteStatement __preparedStmtOfSetBookmarkStatus;

  public CachedProjectsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCachedProject = new EntityInsertionAdapter<CachedProject>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `projects`(`project_id`,`name`,`fullName`,`starCount`,`dateCreated`,`ownerName`,`ownerAvatar`,`is_bookmarked`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedProject value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullName());
        }
        if (value.getStarCount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStarCount());
        }
        if (value.getDateCreated() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDateCreated());
        }
        if (value.getOwnerName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOwnerName());
        }
        if (value.getOwnerAvatar() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOwnerAvatar());
        }
        final int _tmp;
        _tmp = value.isBookmarked() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__preparedStmtOfDeleteProjects = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM projects";
        return _query;
      }
    };
    this.__preparedStmtOfSetBookmarkStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE projects SET is_bookmarked = ? WHERE project_id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertProjects(List<CachedProject> projects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCachedProject.insert(projects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteProjects() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProjects.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteProjects.release(_stmt);
    }
  }

  @Override
  public void setBookmarkStatus(boolean isBookmarked, String projectId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetBookmarkStatus.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = isBookmarked ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 2;
      if (projectId == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, projectId);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetBookmarkStatus.release(_stmt);
    }
  }

  @Override
  public Flowable<List<CachedProject>> getProjects() {
    final String _sql = "SELECT * FROM projects";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"projects"}, new Callable<List<CachedProject>>() {
      public List<CachedProject> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("project_id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfFullName = _cursor.getColumnIndexOrThrow("fullName");
          final int _cursorIndexOfStarCount = _cursor.getColumnIndexOrThrow("starCount");
          final int _cursorIndexOfDateCreated = _cursor.getColumnIndexOrThrow("dateCreated");
          final int _cursorIndexOfOwnerName = _cursor.getColumnIndexOrThrow("ownerName");
          final int _cursorIndexOfOwnerAvatar = _cursor.getColumnIndexOrThrow("ownerAvatar");
          final int _cursorIndexOfIsBookmarked = _cursor.getColumnIndexOrThrow("is_bookmarked");
          final List<CachedProject> _result = new ArrayList<CachedProject>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CachedProject _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpStarCount;
            _tmpStarCount = _cursor.getString(_cursorIndexOfStarCount);
            final String _tmpDateCreated;
            _tmpDateCreated = _cursor.getString(_cursorIndexOfDateCreated);
            final String _tmpOwnerName;
            _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            final String _tmpOwnerAvatar;
            _tmpOwnerAvatar = _cursor.getString(_cursorIndexOfOwnerAvatar);
            final boolean _tmpIsBookmarked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsBookmarked);
            _tmpIsBookmarked = _tmp != 0;
            _item = new CachedProject(_tmpId,_tmpName,_tmpFullName,_tmpStarCount,_tmpDateCreated,_tmpOwnerName,_tmpOwnerAvatar,_tmpIsBookmarked);
            _result.add(_item);
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

  @Override
  public Flowable<List<CachedProject>> getBookmarkedProjects() {
    final String _sql = "SELECT * FROM projects WHERE is_bookmarked = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"projects"}, new Callable<List<CachedProject>>() {
      public List<CachedProject> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("project_id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfFullName = _cursor.getColumnIndexOrThrow("fullName");
          final int _cursorIndexOfStarCount = _cursor.getColumnIndexOrThrow("starCount");
          final int _cursorIndexOfDateCreated = _cursor.getColumnIndexOrThrow("dateCreated");
          final int _cursorIndexOfOwnerName = _cursor.getColumnIndexOrThrow("ownerName");
          final int _cursorIndexOfOwnerAvatar = _cursor.getColumnIndexOrThrow("ownerAvatar");
          final int _cursorIndexOfIsBookmarked = _cursor.getColumnIndexOrThrow("is_bookmarked");
          final List<CachedProject> _result = new ArrayList<CachedProject>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CachedProject _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpStarCount;
            _tmpStarCount = _cursor.getString(_cursorIndexOfStarCount);
            final String _tmpDateCreated;
            _tmpDateCreated = _cursor.getString(_cursorIndexOfDateCreated);
            final String _tmpOwnerName;
            _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            final String _tmpOwnerAvatar;
            _tmpOwnerAvatar = _cursor.getString(_cursorIndexOfOwnerAvatar);
            final boolean _tmpIsBookmarked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsBookmarked);
            _tmpIsBookmarked = _tmp != 0;
            _item = new CachedProject(_tmpId,_tmpName,_tmpFullName,_tmpStarCount,_tmpDateCreated,_tmpOwnerName,_tmpOwnerAvatar,_tmpIsBookmarked);
            _result.add(_item);
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
