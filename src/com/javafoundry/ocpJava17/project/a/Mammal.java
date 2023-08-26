package com.javafoundry.ocpJava17.project.a;

public abstract class Mammal extends Animal implements Speakable {
    {
        setBreathsAir(true);
        setBreathsWater(false);
        setFlies(false);
        setHasVertebra(true);
        setPrimarySkin(Skin.Fur);
        setSecondarySkin(null);
        setWarmBlooded(true);
    }

}
