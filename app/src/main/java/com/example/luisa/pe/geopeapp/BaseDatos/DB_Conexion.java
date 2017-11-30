package com.example.luisa.pe.geopeapp.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.luisa.pe.geopeapp.BaseDatos.UbicationGPS.*;

/**
 * Created by luma on 29/11/2017.
 */


public class DB_Conexion extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "UbicationGPS.db";

    public DB_Conexion(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Comandos SQL
        sqLiteDatabase.execSQL(String.format(
                "CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL);",
                UbicationGPSMean.UbicationGPSInput.TABLE_NAME,
                UbicationGPSMean.UbicationGPSInput._ID,
                UbicationGPSMean.UbicationGPSInput.LAT,
                UbicationGPSMean.UbicationGPSInput.LON,
                UbicationGPSMean.UbicationGPSInput.ALT,
                UbicationGPSMean.UbicationGPSInput.VEL,
                UbicationGPSMean.UbicationGPSInput.TIME)
        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // No hay operaciones
    }

    public long save(UbicationGPS loc) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        return sqLiteDatabase.insert(
                UbicationGPSMean.UbicationGPSInput.TABLE_NAME,
                null, loc.toContentValues());

    }
}