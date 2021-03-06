package com.example.swy.wy_map.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.swy.wy_map.Entity.TourNote;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TOUR_NOTE".
*/
public class TourNoteDao extends AbstractDao<TourNote, Long> {

    public static final String TABLENAME = "TOUR_NOTE";

    /**
     * Properties of entity TourNote.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property NoteId = new Property(0, Long.class, "noteId", true, "_id");
        public final static Property NoteContext = new Property(1, String.class, "noteContext", false, "NOTE_CONTEXT");
    }


    public TourNoteDao(DaoConfig config) {
        super(config);
    }
    
    public TourNoteDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TOUR_NOTE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: noteId
                "\"NOTE_CONTEXT\" TEXT);"); // 1: noteContext
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TOUR_NOTE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TourNote entity) {
        stmt.clearBindings();
 
        Long noteId = entity.getNoteId();
        if (noteId != null) {
            stmt.bindLong(1, noteId);
        }
 
        String noteContext = entity.getNoteContext();
        if (noteContext != null) {
            stmt.bindString(2, noteContext);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TourNote entity) {
        stmt.clearBindings();
 
        Long noteId = entity.getNoteId();
        if (noteId != null) {
            stmt.bindLong(1, noteId);
        }
 
        String noteContext = entity.getNoteContext();
        if (noteContext != null) {
            stmt.bindString(2, noteContext);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TourNote readEntity(Cursor cursor, int offset) {
        TourNote entity = new TourNote( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // noteId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // noteContext
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TourNote entity, int offset) {
        entity.setNoteId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoteContext(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TourNote entity, long rowId) {
        entity.setNoteId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TourNote entity) {
        if(entity != null) {
            return entity.getNoteId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TourNote entity) {
        return entity.getNoteId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
