package de.jeff_media.lumberjack.listeners;

import de.jeff_media.lumberjack.LumberJack;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    final LumberJack plugin;

    public PlayerListener(LumberJack plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        plugin.registerPlayer(e.getPlayer());
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        plugin.unregisterPlayer(e.getPlayer());
    }


}