package com.skywalx.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ExplosionStickClickListener implements Listener {

    @EventHandler
    public void onExplosionStickClick(PlayerInteractEvent e) {
        if (!e.getAction().isRightClick()) {
            return;
        }

        ItemStack item = e.getItem();
        if (item == null || !item.getType().equals(Material.BLAZE_ROD)) {
            return;
        }

        Player player = e.getPlayer();
        player.getEyeLocation().createExplosion(4.0F);
    }

}
