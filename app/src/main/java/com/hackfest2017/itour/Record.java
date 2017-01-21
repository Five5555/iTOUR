package com.hackfest2017.itour;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class Record extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "five.db";
    private static final String TABLE_PRODUTCS = "Record";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_FULLNAME = "fullname";
    private static final String COLUMN_PASSWORD = "password";


    public Record(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" +TABLE_PRODUTCS +"(" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT "+
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT "+COLUMN_USERNAME + "TEXT "+
                COLUMN_FULLNAME+ "TEXT "+COLUMN_PASSWORD + "TEXT " + ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_PRODUTCS);
        onCreate(db);
    }
    public void insert(database database)
    {
        ContentValues content = new ContentValues();
        content.put(COLUMN_USERNAME,database.get_username());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PRODUTCS,null,content);
        db.close();
    }
    public void insert1(database database)
    {
        ContentValues content1 = new ContentValues();
        content1.put(COLUMN_FULLNAME,database.get_fullname());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PRODUTCS,null,content1);
        db.close();
    }
    public void insert2(database database)
    {
        ContentValues content2= new ContentValues();
        content2.put(COLUMN_PASSWORD,database.get_password());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PRODUTCS,null,content2);
        db.close();
    }
}
