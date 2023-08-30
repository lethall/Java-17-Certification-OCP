package com.javafoundry.ocpJava17.project.a;

public class Dog extends Canine {

    public static void main(String[] args) {
        Dog fido = new Dog(){
            @Override
            public String speak(){
                return "Woof woof?";
            }
        };
        System.out.println(fido);
        System.out.println(fido.speak());
        System.out.println(fido.dig());
    }

    @Override
    public String dig() {
        return "Digs with paws.";
    }
}
