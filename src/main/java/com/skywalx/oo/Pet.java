package com.skywalx.oo;

public abstract class Pet implements Speakable {

    private String name;
    private static int petsAlive = 0;

    public Pet(String name) {
        this.name = name;
        petsAlive++;
    }

    public String getName() {
        return "Naam: " + name;
    }
}
