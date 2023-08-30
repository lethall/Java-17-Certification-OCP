package com.javafoundry.ocpJava17.project.a;

public class Parrot extends Avian{
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        System.out.println(polly);
        System.out.println(polly.dig());
        System.out.println(polly.speak());
    }

    @Override
    public String dig() {
        return "Digs with claws.";
    }

    @Override
    public String speak() {
        return "Polly want a cracker?";
    }
}
