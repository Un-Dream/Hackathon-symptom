package com.example.myhospital;

public class Patient{
    private int age;
    private double latitude;
    private double longitude;
    private int ESI;
    private static Patient patient = new Patient();

    private Patient() {
        this.age = 15;
        this.latitude = 43.658;
        this.longitude = -79.43324;
    }

    public static Patient getPatient(){
        return patient;
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

    public String getResult(){
        Hospital hospital = Data.getHospital(this);

        return "Go to: " + hospital.getName() + " at " + hospital.getAddress();
    }
}
