package com.javafoundry.ocpJava17.project.a;

public class Penguin extends Avian{
    public static void main(String[] args) {
        Penguin happyFeet = new Penguin();
        System.out.println(happyFeet);
        System.out.println(happyFeet.dig());
        System.out.println(happyFeet.speak());
    }

    @Override
    public String dig() {
        return "Digs with flippers."; //what to do if this thing doesn't dig?
    }

    @Override
    public String speak() {
        return "Wait... what do penguins sound like?";
    }
}
