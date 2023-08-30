package com.javafoundry.ocpJava17.project.b;

public final class BirthdayBalloon extends Balloon {

    public BirthdayBalloon(String color) {
        super(color);
    }

    public String nameTag(){
        return "reads the nametag";
    }

    @Override
    public String toString() {
        return "Pop!";
    }
}
