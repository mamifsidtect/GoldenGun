package edu.txstate.mat281.GGR.listeners;

import edu.txstate.mat281.GGR.GoldenGunReboot;
import edu.txstate.mat281.GGR.game.GPlayer;
import edu.txstate.mat281.GGR.managers.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        GPlayer gPlayer = GoldenGunReboot.getInstance().getPlayerManager().getGPlayer(player);

        if (!gPlayer.isOP()) {
            event.setJoinMessage("");
        }


    }
}
