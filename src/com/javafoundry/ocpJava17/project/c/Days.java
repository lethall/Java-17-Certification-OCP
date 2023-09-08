package com.javafoundry.ocpJava17.project.c;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Days {

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM-dd-yyyy");

    public static void main(String[] args) throws ParseException {
        String inputDateString = args[0];
        Date inputDate = DATE_FORMAT.parse(inputDateString);
        Date nowDate = new Date();
        Long fooBarDiff = calcDiffDays(inputDate, nowDate);
        System.out.println(fooBarDiff + " is the number of days from " + nowDate + " to " + inputDate);
    }

    public static Long calcDiffDays(Date dateA, Date dateB) {
        Long dateASeconds = dateA.toInstant().getEpochSecond();
        Long dateBSeconds = dateB.toInstant().getEpochSecond();
        Long daysDiff = (dateASeconds - dateBSeconds) / (60*60*24);
        return daysDiff;
    }

    public static Long calcDiffDays(String dateA, String dateB) throws ParseException {
        Date a = DATE_FORMAT.parse(dateA);
        Date b = DATE_FORMAT.parse(dateB);
        return calcDiffDays(a, b);
    }
}
