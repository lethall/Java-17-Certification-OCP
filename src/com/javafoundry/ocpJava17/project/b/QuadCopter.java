package com.javafoundry.ocpJava17.project.b;

public class QuadCopter extends Aircraft{
    {
        setHasRotors(true);
        setManned(false);
    }//end of initializer block

    @Override
    public String fly() {
        return "weeeeee, we're flying!".toUpperCase();
    }
}//end of class definition
