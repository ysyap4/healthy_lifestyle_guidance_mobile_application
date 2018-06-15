package com.example.eunoia.user_profile3.userprofile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.eunoia.user_profile3.bmicalculator.Update;

/**
 * Created by username on 16/5/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "profile";

    // tasks table name
    private static final String TABLE_USER = "User";
    //tasks Table Columns name
    private static final String KEY_USERNAME = "userName";
    private static final String KEY_WEIGHT = "weight";
    private static final String KEY_HEIGHT = "height";
    private static final String KEY_WATER = "water";

    private static final String[] COLUMNS = {KEY_USERNAME,KEY_WEIGHT,KEY_HEIGHT,KEY_WATER};

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE " + TABLE_USER + " ( "
                    + KEY_USERNAME + " TEXT, "
                    + KEY_WEIGHT + " DOUBLE, "
                    + KEY_HEIGHT + " DOUBLE, "
                    + KEY_WATER + " DOUBLE );";
            db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        onCreate(db);
    }

    public void addUser(Update user){
        //for logging
        Log.d("addUser", user.toString());

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, user.getName()); // get username
        values.put(KEY_WEIGHT, user.getWeight()); // get weight
        values.put(KEY_HEIGHT, user.getHeight()); // get height
        values.put(KEY_WATER, user.getWater()); // get water

        db.insert(TABLE_USER, null,values);
        Log.d("user", values.toString());
        db.close();
    }

    public Update getAllUsers() {

        String query = "SELECT  * FROM " + TABLE_USER;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        Update p1 = null;
        if (cursor.moveToLast()) {
                p1 = new Update();
                p1.setName(cursor.getString(0));
                p1.setWeight(Double.parseDouble(cursor.getString(1)));
                p1.setHeight(Double.parseDouble(cursor.getString(2)));
        }

        Log.d("get user", p1.toString());

        return p1;
    }

    public Boolean checkDB()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor mCursor = db.rawQuery("SELECT * FROM " + TABLE_USER, null);
        Boolean rowExists;

        if (mCursor.moveToFirst())rowExists = true;
        else rowExists = false;

        return  rowExists;
    }
}