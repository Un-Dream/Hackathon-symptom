package com.example.testtry;

public class Hospital {
    private String name;
    private String address;
    private String postalCode;
    private float latitude;
    private float longitude;
    private int capacity;
    /* TODO Morgan add other fields */

    Hospital(String name, String address, String postalCode, float latitude) { // TODO Add rest
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.latitude = latitude;
        // TODO continue
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // TODO continue
}
