package com.javafoundry.ocpJava17.project.a;

public class Cat extends Feline{
    public static void main(String[] args) {
        Cat chaos = new Cat();
        System.out.println(chaos);
        System.out.println(chaos.speak());
        System.out.println(chaos.dig());
    }

    @Override
    public String dig() {
        return "Digs with paws.";
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Mice and cat food.";
    }
}
