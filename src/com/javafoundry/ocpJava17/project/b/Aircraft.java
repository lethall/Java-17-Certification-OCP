package com.javafoundry.ocpJava17.project.b;

public abstract class Aircraft extends Vehicle {
    private boolean hasWings;
    private boolean hasRotors;
    private boolean isLighterThanAir;

    public boolean isHasWings() {
        return hasWings;
    }

    public abstract String fly();

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public boolean isHasRotors() {
        return hasRotors;
    }

    public void setHasRotors(boolean hasRotors) {
        this.hasRotors = hasRotors;
    }

    public boolean isLighterThanAir() {
        return isLighterThanAir;
    }

    public void setLighterThanAir(boolean lighterThanAir) {
        this.isLighterThanAir = lighterThanAir;
    }

}
