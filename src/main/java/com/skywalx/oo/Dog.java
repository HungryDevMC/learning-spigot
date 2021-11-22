package com.skywalx.oo;

import org.bukkit.Bukkit;

import java.util.logging.Level;

public class Dog extends Pet {

    private String leashColor;

    public Dog() {
        super("Jefke");
        this.leashColor = "BLUE";
    }

    public void talk() {
        Bukkit.getLogger().log(Level.INFO, "woof");
    }
}
