package com.example.luisa.pe.geopeapp.BaseDatos;

import android.provider.BaseColumns;

/**
 * Created by luma on 29/11/2017.
 */

public class UbicationGPSMean {
    public static abstract class UbicationGPSInput implements BaseColumns {
        public static final String TABLE_NAME ="UbicationGPS";

        public static final String LAT = "lat";
        public static final String LON = "lon";
        public static final String ALT = "alt";
        public static final String VEL = "vel";
        public static final String TIME = "time";
    }

}
