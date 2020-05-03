package com.example.myhospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private static List<Hospital> hospitals = new ArrayList<>(Arrays.asList(
            new Hospital("St. Michael's Hospital", "30 Bond Street", "M5B1W8", 43.7115277f, -79.28365376f, 463, 248, 47, 20, 200, 420, 104, 234, 321),
            new Hospital("Mount Sinai Hospital", "600 university avenue", "M5G1X5", 43.65770559f, -79.38972699f, 442, 442, 39, 23, 0, 123, 421, 87, 42),
            new Hospital("Toronto General Hospital", "200 elizabeth street", "M5G2C4", 43.65958679f, -79.38706779f, 471, 313, 43, 15, 93, 2, 545, 131, 133),
            new Hospital("Princess Margaret Hospital", "610 university avenue", "M5G2M9", 43.65822539f, -79.38994659f, 220, 82, 32, 8, 45, 275, 711, 5, 51),
            new Hospital("The Hospital for Sick Children", "555 university avenue", "M5G1X8", 43.65710429f, -79.38773779f, 70, 42, 5, 15, 28, 26, 522, 102, 67)
    ));

    private static Map<Integer, Integer> ESI_distance = new HashMap<Integer, Integer>();

    static {
        ESI_distance.put(1, 1);
        ESI_distance.put(2, 2);
        ESI_distance.put(3, 3);
    }


    public static double getDistance(Hospital hospital, double lat, double longitude) {
        double y = longitude - hospital.getLongitude();
        double x = lat - hospital.getLatitude();
        return Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
    }

    public static Hospital getHospital(final Patient patient) {
        double value = Double.MIN_VALUE;
        Hospital bestHospital = null;
        double maxDist = ESI_distance.get(patient.getESI());

        for (int  i = 0 ;  i < hospitals.size() ; i ++){
            Hospital hospital = hospitals.get(i);
            if (hospital.getValue() > value && getDistance(hospital, patient.getLatitude(), patient.getLongitude()) < maxDist){
                value = hospital.getValue();
                bestHospital = hospital;
            }
        }
        return bestHospital;
    }
}
