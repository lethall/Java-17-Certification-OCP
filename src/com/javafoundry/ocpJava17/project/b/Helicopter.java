package com.javafoundry.ocpJava17.project.b;

public class Helicopter extends Aircraft implements Honkable {
    {
        setHasRotors(true);
        setManned(false);
    }//end of initializer block

    @Override
    public String fly() {
        return "weeeeee, we're flying a helicopter!".toUpperCase();
    }

    @Override
    public String honk() {
        return "I'm a helicopter honk.";
    }
}//end of class definition
