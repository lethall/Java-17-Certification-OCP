package com.javafoundry.ocpJava17.project.a;

public class Bat extends Mammal {
    {
        setFlies(true);
    }

    public static void main(String[] args) {
        System.out.println(new Bat());
    }

    @Override
    public String speak() {
        return "squeak!";
    }
}
