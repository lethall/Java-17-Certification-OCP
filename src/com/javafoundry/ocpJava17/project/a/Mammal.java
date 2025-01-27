package com.javafoundry.ocpJava17.project.a;

public abstract class Mammal extends Animal implements Speakable, Diggable {
    {
        setBreathsAir(true);
        setBreathsWater(false);
        setFlies(false);
        setHasVertebra(true);
        setPrimarySkin(Skin.Fur);
        setSecondarySkin(null);
        setWarmBlooded(true);
    }

    public abstract String eat();

}
