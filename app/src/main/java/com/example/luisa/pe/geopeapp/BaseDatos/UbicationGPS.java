package com.example.luisa.pe.geopeapp.BaseDatos;

import android.content.ContentValues;

/**
 * Created by luma on 29/11/2017.
 */

public class UbicationGPS {
    private String lat;
    private String lon;
    private String alt;
    private String vel;
    private String time;

    public UbicationGPS(String lat, String lon, String alt, String vel, String time) {
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vel = vel;
        this.time = time;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getVel() {
        return vel;
    }

    public void setVel(String vel) {
        this.vel = vel;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String fechaHora) {
        time = time;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(UbicationGPSMean.UbicationGPSInput.LAT, this.lat);
        values.put(UbicationGPSMean.UbicationGPSInput.LON, this.lon);
        values.put(UbicationGPSMean.UbicationGPSInput.ALT, this.alt);
        values.put(UbicationGPSMean.UbicationGPSInput.VEL, this.vel );
        values.put(UbicationGPSMean.UbicationGPSInput.TIME, this.time);
        return values;
    }
}
