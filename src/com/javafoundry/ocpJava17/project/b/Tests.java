package com.javafoundry.ocpJava17.project.b;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tests {
    public static void main(String[] args) {
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
        var handler = new ConsoleHandler();
        handler.setLevel(Level.FINEST);
        log.addHandler(handler);
        PickupTruck silverado = new PickupTruck("purple");
        log.finest("My truck: " + silverado);
        Integer.parseInt("2");
    }
}