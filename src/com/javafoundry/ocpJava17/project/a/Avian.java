package com.javafoundry.ocpJava17.project.a;

public abstract class Avian extends Animal implements Speakable, Diggable{
    {
        setBreathsAir(true);
        setBreathsWater(false);
        setFlies(true);
        setHasVertebra(true);
        setPrimarySkin(Skin.Feathers);
        setSecondarySkin(null);
        setWarmBlooded(true);
    }
}
