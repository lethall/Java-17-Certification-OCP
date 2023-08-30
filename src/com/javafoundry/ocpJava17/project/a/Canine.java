package com.javafoundry.ocpJava17.project.a;

public abstract class Canine extends Mammal {
    @Override
    public String speak() {
        return "Woof!";
    }
    @Override
    public String eat() {
        return "Meat based foods.";
    }
}
