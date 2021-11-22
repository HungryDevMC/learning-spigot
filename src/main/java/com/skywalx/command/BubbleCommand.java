package com.skywalx.command;

import com.skywalx.BubblePlugin;
import com.skywalx.oo.Dog;
import com.skywalx.oo.Pet;
import com.skywalx.runnables.BubbleRunnable;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class BubbleCommand implements CommandExecutor {

    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(commandSender instanceof Player)) {
            Bukkit.getLogger().log(Level.SEVERE, "You cannot spawn bubbles if you're not a player!");
            return false;
        }

        if (!label.equalsIgnoreCase("bubbles")) {
            return false;
        }

        Player player = (Player) commandSender;
        player.sendMessage("BUBBLES!!!");
        BubbleRunnable bubbleRunnable = new BubbleRunnable(player);
        bubbleRunnable.runTaskTimer(BubblePlugin.getBubblePlugin(), 40, 40);
        return true;
    }
}
