package com.example.anggerikoaryasena.cakramobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Anggeriko Aryasena on 11/20/2015.
 */
public class DBCakra extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "DBCakra.db";

    public DBCakra(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table user " +
                        "(name text primary key,tanggallahir text,jeniskelamin text, linkfoto text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }

    public boolean insertUser(String name, String tanggallahir, String jeniskelamin, String linkfoto){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("tanggallahir", tanggallahir);
        contentValues.put("jeniskelamin", jeniskelamin);
        contentValues.put("linkfoto", linkfoto);
        db.insert("user", null, contentValues);
        return true;
    }
}
