package com.example.myrecipeapptensorflow.OtherActivities;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class RecipeDatabaseHelper extends SQLiteOpenHelper {

    public static final String databaseName = "Recipe.db";

    public RecipeDatabaseHelper(@Nullable Context context) {
        super(context, "Recipe.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create Table recipes(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredients TEXT, instructions TEXT, image BLOB)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int i, int i1) {
        MyDatabase.execSQL("drop Table if exists recipes");
    }

    public Boolean insertData(String name,String ingredients, String instructions, byte[] image){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("ingredients", ingredients);
        contentValues.put("instructions", instructions);
        contentValues.put("image", image);
        long result = MyDatabase.insert("recipes", null, contentValues);

        if (result == -1){
            return false;
        } else {
            return true;
        }
    }

    public Cursor getData(){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from recipes", null);
        return cursor;
    }
}
