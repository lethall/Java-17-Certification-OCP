package com.javafoundry.ocpJava17.project.b;

public sealed class Balloon permits BirthdayBalloon {
    public String getColor() {
        return color;
    }

    private String color;
    public Balloon(String color){
        this.color = color;
    }
}
