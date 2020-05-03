package com.example.testtry;

public class Patient{
    private int age;
    private double latitude;
    private double longitude;
    private int ESI;

    Patient() {
        this.age = 220;
        this.latitude = 0;
        this.longitude = 0;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getAge() {
        return age;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getESI() {
        return ESI;
    }

    public void setESI(int ESI) {
        this.ESI = ESI;
    }
}
