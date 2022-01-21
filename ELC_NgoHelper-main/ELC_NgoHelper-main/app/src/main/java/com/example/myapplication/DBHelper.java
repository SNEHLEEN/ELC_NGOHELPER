package com.example.myapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper{

    final  static String DBNAME = "mydatabase.db";
    final static int DBVERSION = 1;

    public DBHelper(Context context) {
        super(context, DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table register(Name text,Name_of_NGO text,Mail_id text,Contact_number text primary key,Address text,Pincode int,Password text,About_your_NGO text,Any_specific_requirements text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){
        sqLiteDatabase.execSQL("DROP table if exists register");
        onCreate(sqLiteDatabase);

    }
 public   Boolean insertregister(String Name, String NGO, String id, String number, String Add, String Pincode, String Pd, String AYN, String ASR){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Name",Name);
        values.put("Name_of_NGO",NGO);
        values.put("Mail_id",id);
        values.put("Contact_number",number);
        values.put("Address",Add);
        values.put("Pincode",Pincode);
        values.put("Password",Pd);
        values.put("About_your_NGO",AYN);
        values.put("Any_specific_requirements",ASR);
        long Contact_number = database.insert("register", null, values);
        if (Contact_number==-1){
            return false;
        } else{
            return true;
        }
    }
}