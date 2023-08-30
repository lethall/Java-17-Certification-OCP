package com.javafoundry.ocpJava17.project.b;

public abstract class Vehicle {
    private boolean hasWheels;
    private boolean hasTreads;
    private boolean isManned;
    private boolean isArmed;
    private boolean isSubmersible;
    private boolean isAmphibious;


    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public boolean isHasTreads() {
        return hasTreads;
    }

    public void setHasTreads(boolean hasTreads) {
        this.hasTreads = hasTreads;
    }

    public boolean isManned() {
        return isManned;
    }

    public void setManned(boolean manned) {
        this.isManned = manned;
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        this.isArmed = armed;
    }

    public boolean isSubmersible() {
        return isSubmersible;
    }

    public void setSubmersible(boolean submersible) {
        this.isSubmersible = submersible;
    }

    public boolean isAmphibious() {
        return isAmphibious;
    }

    public void setAmphibious(boolean amphibious) {
        this.isAmphibious = amphibious;
    }

    @Override
    public String toString() {
        String s = this.getClass().getName() + "{" +
                "hasWheels=" + hasWheels +
                ", hasTreads=" + hasTreads +
                ", isManned=" + isManned +
                ", isArmed=" + isArmed +
                ", isSubmersible=" + isSubmersible +
                ", isAmphibious=" + isAmphibious;

        if (this instanceof Aircraft) {
            Aircraft a = (Aircraft) this;
            s += ", hasWings=" + a.isHasWings() +
                    ", hasRotors=" + a.isHasRotors() +
                    ", isLighterThanAir=" + ((Aircraft) this).isLighterThanAir() +
                    a.fly();
        }
        if (this instanceof Honkable){
            s += ", honk: " + ((Honkable) this).honk();
        }
        return s + '}';
    }
}
