package com.javafoundry.ocpJava17.project.a;

public abstract class Animal {
    private boolean isWarmBlooded;
    private boolean hasVertebra;
    private boolean breathsAir;
    private boolean breathsWater;
    private boolean flies;
    private Skin primarySkin;
    private Skin secondarySkin;

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        isWarmBlooded = warmBlooded;
    }

    public boolean isHasVertebra() {
        return hasVertebra;
    }

    public void setHasVertebra(boolean hasVertebra) {
        this.hasVertebra = hasVertebra;
    }

    public boolean isBreathsAir() {
        return breathsAir;
    }

    public void setBreathsAir(boolean breathsAir) {
        this.breathsAir = breathsAir;
    }

    public boolean isBreathsWater() {
        return breathsWater;
    }

    public void setBreathsWater(boolean breathsWater) {
        this.breathsWater = breathsWater;
    }

    public boolean isFlies() {
        return flies;
    }

    public void setFlies(boolean flies) {
        this.flies = flies;
    }

    public Skin getPrimarySkin() {
        return primarySkin;
    }

    public void setPrimarySkin(Skin primarySkin) {
        this.primarySkin = primarySkin;
    }

    public Skin getSecondarySkin() {
        return secondarySkin;
    }

    public void setSecondarySkin(Skin secondarySkin) {
        this.secondarySkin = secondarySkin;
    }

    @Override
    public String toString() {
        //refactor to stringbuilder
        //learn more about mutable and immutable
        StringBuilder animalSummary = new StringBuilder();
        animalSummary.append("{isWarmBlooded=" + isWarmBlooded);
        animalSummary.append(", hasVertebra=" + hasVertebra);
        animalSummary.append(", breathsAir=" + breathsAir);
        animalSummary.append(", breathsWater=" + breathsWater);
        animalSummary.append(", flies=" + flies);
        animalSummary.append(", primarySkin=" + primarySkin);
        animalSummary.append(", secondarySkin=" + secondarySkin);
        animalSummary.append(", ");

        if (this instanceof Speakable){
            animalSummary.append("Sounds like: " + ((Speakable)this).speak());
        }
        if (this instanceof Diggable){
            animalSummary.append(" Diggable: " + ((Diggable)this).dig());
        }
        else {
            animalSummary.append("Crickets Chirping.");
        }
        animalSummary.append("}");
        animalSummary.insert(0, "James", 2, 4);
        return animalSummary.toString();
        //be familiar with all of what string does, explain how format works recap at 2pm
    }

    public enum Skin {
        Naked,
        Fur,
        Scales,
        ExoSkeleton,
        Feathers
    }
}
