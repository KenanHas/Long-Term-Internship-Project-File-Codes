package com.kenanh.dictionary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    private Context context;
    public static final String DATABASE_NAME = "Sozluk";
    public  static final String TABLE_NAME = "kelimeler";
    public  static final String COL1 = "id";
    public  static final String COL2 = "kelime";
    public  static final String COL3 = "kelime_anlami";
    public  static final String COL4 = "kategori";
    public Database( Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE " + TABLE_NAME +" (id Integer Primary Key, kelime Varchar," +
                "kelime_anlami Varchar, kategori Varchar)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }
    public void addWord(String kelime, String kelimeAnlami, String kategori)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,kelime);
        contentValues.put(COL3,kelimeAnlami);
        contentValues.put(COL4,kategori);
        db.insert(TABLE_NAME,null, contentValues);

    }
   public Cursor veriListe(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
    public void kelimeGuncelle(String id,String kelime, String kelimeAnlami, String kategori)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,kelime);
        contentValues.put(COL3,kelimeAnlami);
        contentValues.put(COL4,kategori);

        long result = db.update(TABLE_NAME,  contentValues, "id=?", new String[]{id});
        if(result == -1){
            Toast.makeText(context, "Kelime Güncellenemedi!!!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Kelime Güncellendi.", Toast.LENGTH_SHORT).show();
        }

    }

}
