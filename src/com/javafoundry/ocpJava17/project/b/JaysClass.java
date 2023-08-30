package com.javafoundry.ocpJava17.project.b;

public class JaysClass {
    public static void main(String[] args) {
        QuadCopter littleDrone = new QuadCopter();
        System.out.println(littleDrone);

        Helicopter bigHelicopter = new Helicopter();
        System.out.println(bigHelicopter);

        Balloon myBalloon = new BirthdayBalloon("red");
        System.out.println(myBalloon + " That was a " + myBalloon.getColor() + " balloon." + ((BirthdayBalloon) myBalloon).nameTag());
    }
}
