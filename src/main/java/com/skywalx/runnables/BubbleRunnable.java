package com.skywalx.runnables;

import org.bukkit.Effect;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class BubbleRunnable extends BukkitRunnable {

    private Player player;
    private int counter = 3;

    public BubbleRunnable(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        counter--;
        player.getWorld().spawnParticle(Particle.WATER_BUBBLE, player.getLocation(), 1);
        if(counter == 0) {
            this.cancel();
        }
    }
}
