package com.example.jc.moviles_2_1;

/**
 * Created by Julio Conchas on 9/5/16.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class DB extends SQLiteOpenHelper {

    public DB(Context context, String nombre, CursorFactory factory, int version){
        super(context,nombre,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE data(name text,nControl text,phone text,birthDate text,degree text,score text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int versionOld ,int versionNew){
        db.execSQL("DROP TABLE IF EXIST data");
        db.execSQL("CREATE TABLE data(name text,nControl text,phone text,birthDate text,degree text,score text)");
    }
}
