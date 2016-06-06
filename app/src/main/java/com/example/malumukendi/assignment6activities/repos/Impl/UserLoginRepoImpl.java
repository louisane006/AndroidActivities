package com.example.malumukendi.assignment6activities.repos.Impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.malumukendi.assignment6activities.repos.UserLoginRepo;

import java.util.Set;

/**
 * Created by Malu.Mukendi on 2016-06-06.
 */
public class UserLoginRepoImpl extends SQLiteOpenHelper implements UserLoginRepo{

        public static final String DATABASE_NAME = "PhotoStudio.db";
        public static final String TABLE_NAME = "user";
        public static final String COL_1 = "EMAIL";
        public static final String COL_2 = "PASSWORD";
        public static final String COL_3 = "NAME";
        public static final String COL_4 = "SURNAME";

        public UserLoginRepoImpl (Context context) {
            super(context, DATABASE_NAME, null, 1);
            SQLiteDatabase db = this.getWritableDatabase();
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            //db.execSQL("CREATE TABLE " + TABLE_NAME + "( ID INTEGER PRIMARY KEY AUTOINCREMENT, EMAIL,PASSWORD,NAME,SURNAME )");
            db.execSQL("CREATE TABLE user ( ID INTEGER PRIMARY KEY AUTOINCREMENT, EMAIL,PASSWORD,NAME,SURNAME )");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS user");
            onCreate(db);
        }

    @Override
    public Object findById(Object o) {
        return null;
    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Object update(Object entity) {
        return null;
    }

    @Override
    public Object delete(Object entity) {
        return null;
    }

    @Override
    public Set findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    public boolean insertData(String email, String password, String name, String surname) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("email", email);
            contentValues.put("password", password);
            contentValues.put("name", name);
            contentValues.put("surname", surname);
            long result = db.insert("user", null, contentValues);
            if (result == -1)
                return false;
            else
                return true;
        }

        public Cursor getAllData() {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select *from user", null);
            return res;
        }
        public Cursor getData(UserLoginRepoImpl login)
        {
            SQLiteDatabase sq = login.getReadableDatabase();
            String[] columns = {"email", "password"};
            Cursor cr = sq.query("user", columns, null, null, null, null, null);
            return cr;
        }
    }

