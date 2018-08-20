package com.beetle.dragon.sabado18.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static android.provider.BaseColumns._ID;
//Me permite manipular la base de datos
public class MyOpenHelper extends SQLiteOpenHelper {
    private static final String NOMBRE_BD = "sabadoBase";
    private static final Integer VERSION_BD = 1;

    public MyOpenHelper(Context cxt, String name) {
        super(cxt,"SabadoBase", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase Db) {
        String query ="CREATE TABLE calculo("+_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"
        +"Calculo INTEGER);";
        Db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase Db, int i, int i1) {
        Db.execSQL("DROP TABLE IF EXISTS calculo");
        onCreate(Db);
    }
}
