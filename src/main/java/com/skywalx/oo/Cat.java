package com.skywalx.oo;

import org.bukkit.Bukkit;

import java.util.logging.Level;

public class Cat extends Pet{

    public Cat() {
        super("Jozefine");
    }

    public void talk() {
        Bukkit.getLogger().log(Level.INFO, "Meow");
    }
}
