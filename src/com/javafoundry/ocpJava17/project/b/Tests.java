package com.javafoundry.ocpJava17.project.b;

import com.javafoundry.ocpJava17.project.c.Days;

import java.text.ParseException;
import java.math.BigDecimal;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tests {
    public static void main(String[] args) throws ParseException {
//        QuadCopter littleDrone = new QuadCopter();
//        System.out.println(littleDrone);
//
//        Helicopter bigHelicopter = new Helicopter();
//        System.out.println(bigHelicopter);
//
//        Balloon myBalloon = new BirthdayBalloon("red");
//        System.out.println(myBalloon + " That was a " + myBalloon.getColor() + " balloon." + ((BirthdayBalloon) myBalloon).nameTag());
//
        Logger log = Logger.getLogger(Tests.class.getName());
        log.setLevel(Level.FINEST);
//        var handler = new ConsoleHandler();
//        handler.setLevel(Level.FINEST);
//        log.addHandler(handler);
        PickupTruck silverado = new PickupTruck("purple");
        log.finest("My truck: " + silverado);
        Integer.parseInt("2");
        System.out.println(Days.calcDiffDays("06-20-2023", "05-21-2023"));
        Integer i = Integer.valueOf("2");
        int j = Integer.MIN_VALUE;
        try {
            j =  Integer.parseInt("2.5");
        } catch (NumberFormatException e) {
            log.warning("This is what happens when a bad string is given: " + e);
        }
        log.info("This is an int: " + j);
        double a = 2.5;
        Double b = Double.valueOf("2.5");
        Float c = Float.valueOf((float)25000.001);
        float d = (float) 2.5;
        BigDecimal e = BigDecimal.valueOf(2.5);

        log.info(String.valueOf(Math.sin(Math.toRadians(30))));
        log.info(String.valueOf(e.precision()));
    }
}
