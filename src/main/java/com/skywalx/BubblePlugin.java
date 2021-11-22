package com.skywalx;

import com.skywalx.command.BubbleCommand;
import com.skywalx.listeners.ExplosionStickClickListener;
import com.skywalx.oo.Dog;
import com.skywalx.oo.Pet;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class BubblePlugin extends JavaPlugin {

    private static BubblePlugin bubblePlugin;

    @Override
    public void onEnable() {
        bubblePlugin = this;
        Bukkit.getLogger().log(Level.INFO, "[BubblePlugin] Enabled");

        Pet pet = new Dog();

        pet.talk();
        Bukkit.getLogger().log(Level.INFO, pet.getName());

        getCommand("bubbles").setExecutor(new BubbleCommand());
        Bukkit.getPluginManager().registerEvents(new ExplosionStickClickListener(), this);
    }

    public static BubblePlugin getBubblePlugin() {
        return bubblePlugin;
    }
}
