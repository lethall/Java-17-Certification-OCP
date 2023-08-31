package com.javafoundry.ocpJava17.project.b;

import java.text.Format;

public abstract class Vehicle {
    private boolean hasWheels;
    private boolean hasTreads;
    private boolean isManned;
    private boolean isArmed;
    private boolean isSubmersible;
    private boolean isAmphibious;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;


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
        StringBuilder output = new StringBuilder();
        output
                .append("This is a ")
                .append(this.color)
                .append(" ")
                .append(this.getClass().getName())//TODO - Strip off package name
                .append("\n")
        ;

        if (hasWheels){
            output
                    .append("It has wheels.\n")
            ;
        } else {
            output.append("It does not have wheels.\n");
        }


        if (hasTreads){
            output.append("it has treads.\n");
        } else {
            output.append("""
it does not have treads.
if it did, the %s can go over rough terrain
""".formatted("thing"));
        }


        if (isManned){
            output.append("It has a human operator.\n");
        } else {
            output.append("It is autonomous or operated by remote.\n");
        }

        if (isArmed){
            output.append("It is armed.\n");
        } else {
            output.append("It is not armed.\n");
        }


        if (isSubmersible){
            output.append("It can operate underwater.\n");
        } else {
            output.append("It can not operate underwater.\n");
        }


        if (isAmphibious){
            output.append("It is amphibious.\n\n");
        } else {
            output.append("It is not amphibious.\n\n");
        }

//        output.append("%n");

//                .append(hasWheels)
//                .append("hasTreads")
//                .append(hasTreads)
//                .append("isManned")
//                .append(isManned)
//                .append("isArmed")
//                .append(isArmed)
//                .append("isSubmersible")
//                .append(isSubmersible)
//                .append("isAmphibious")
//                .append(isAmphibious)
        ;
        return output.toString();
//                " that " + hasWheels +
//                ", hasTreads=" + hasTreads +
//                ", isManned=" + isManned +
//                ", isArmed=" + isArmed +
//                ", isSubmersible=" + isSubmersible +
//                ", isAmphibious=" + isAmphibious;
//
//        if (this instanceof Aircraft) {
//            Aircraft a = (Aircraft) this;
//            output += ", hasWings=" + a.isHasWings() +
//                    ", hasRotors=" + a.isHasRotors() +
//                    ", isLighterThanAir=" + ((Aircraft) this).isLighterThanAir() +
//                    a.fly();
//        }
//        if (this instanceof Honkable){
//            output += ", honk: " + ((Honkable) this).honk();
//        }
//        return output + '}';
    }
}
