package com.javafoundry.ocpJava17.project.a;

public class Bat extends Mammal {

    public Bat(){
        test();
        setFlies(true);
    }

    //initializer blocks are always executed before the constructor
    {
        setFlies(false);
        System.out.println("ran initializer block");
    }
    public void test(){
        System.out.println("running test");
    }

    public static void main(String[] args) {
        System.out.println(new Bat());
    }

    @Override
    public String speak() {
        return "squeak!";
    }

    @Override
    public String dig() {
        return "Digs with hind feet";
    }

    @Override
    public String eat() {
        return null;
    }
}
