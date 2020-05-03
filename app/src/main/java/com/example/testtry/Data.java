package com.example.testtry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<Hospital> resources = new ArrayList<>(Arrays.asList(
            new Hospital("St. Michael's Hospital", "30 Bond Street", "M5B1W8", 43.7115277f,  -79.28365376f, 463, 248,	47,	20,	200,	420,	104,	234,	321),
            new Hospital("Mount Sinai Hospital",	"600 university avenue",	"M5G1X5",	43.65770559f,	-79.38972699f,	442,	442,	39,	23,	0,	123,	421,	87,	42),
            new Hospital("Toronto General Hospital",	"200 elizabeth street", "M5G2C4",	43.65958679f,	-79.38706779f,	471,	313,	43,	15,	93,	2,	545,	131,	133),
            new Hospital("Princess Margaret Hospital",	"610 university avenue",	"M5G2M9",	43.65822539f,	-79.38994659f,	220,	82,	32,	8,	45,	275,	711,	5,	51),
            new Hospital("The Hospital for Sick Children",	"555 university avenue",	"M5G1X8",	43.65710429f,	-79.38773779f,	70,42,	5,	15,	28,	26,	522,	102,	67)
    ));
}
