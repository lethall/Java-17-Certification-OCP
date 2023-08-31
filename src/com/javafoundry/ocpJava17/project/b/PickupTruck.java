package com.javafoundry.ocpJava17.project.b;

public class PickupTruck extends LandVehicle implements Honkable {
    {
        setHasWheels(true);
        setManned(true);
    }
    public PickupTruck(String color){
        setColor(color);
    }
    @Override
    public String honk() {
        return "Beep beep!";
    }
}
