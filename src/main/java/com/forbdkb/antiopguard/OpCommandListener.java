package com.forbdkb.antiopguard;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OpCommandListener implements Listener {

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        String message = event.getMessage().toLowerCase().trim();

        if (message.startsWith("/op ") || message.equals("/op")
                || message.startsWith("/deop ") || message.equals("/deop")
                || message.startsWith("/minecraft:op") || message.startsWith("/minecraft:deop")
                || message.startsWith("/bukkit:op") || message.startsWith("/bukkit:deop")
                || message.startsWith("/essentials:op") || message.startsWith("/essentials:deop")) {

            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "This command can only be used from the server console!");
            event.getPlayer().sendMessage(ChatColor.YELLOW + "OP commands are disabled for all players.");
        }
    }
}
