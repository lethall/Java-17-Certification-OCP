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
        return this.getClass().getName() + "{" +
                "isWarmBlooded=" + isWarmBlooded +
                ", hasVertebra=" + hasVertebra +
                ", breathsAir=" + breathsAir +
                ", breathsWater=" + breathsWater +
                ", flies=" + flies +
                ", primarySkin=" + primarySkin +
                ", secondarySkin=" + secondarySkin +
                '}';
    }

    public enum Skin {
        Naked,
        Fur,
        Scales,
        ExoSkeleton,
        Feathers
    }
}
