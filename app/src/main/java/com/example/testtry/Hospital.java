package com.example.testtry;

public class Hospital {
    private String name;
    private String address;
    private String postalCode;
    private float latitude;
    private float longitude;
    private int capacity;
    private int patients;
    private int nurses;
    private int doctors;
    private int availability;
    private int ventalitors;
    private int drugs;
    private int blood;
    private int IV_drops;

    Hospital(String name, String address, String postalCode, float latitude, float longitude, int capacity, int patients, int nurses, int doctors, int availability, int ventalitors, int drugs, int blood, int IV_drugs) {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capacity = capacity;
        this.patients = patients;
        this.nurses = nurses;
        this.doctors = doctors;
        this.availability = availability;
        this.ventalitors = ventalitors;
        this.drugs = drugs;
        this.blood = blood;
        this.IV_drops = IV_drugs;
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

    public String getAddress() {return address;}

    public String getPostalCode() {return postalCode;}
    public int getCapcity() {return capacity;}

    public int getPatients(){ return patients;}
    public int getNurses(){return nurses;}
    public int getDoctors(){ return doctors;}
    public int getAvailability(){ return availability;}
    public int getVentalitors(){return ventalitors;}
    public int getDrugs(){return drugs;}
    public int getBlood(){return blood;}
    public int getIV_drops(){return IV_drops;}


}
