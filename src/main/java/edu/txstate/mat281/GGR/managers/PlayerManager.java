package edu.txstate.mat281.GGR.managers;

import edu.txstate.mat281.GGR.GoldenGunReboot;
import edu.txstate.mat281.GGR.game.GPlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {

    private HashMap<UUID, GPlayer> gPlayerMap = new HashMap<UUID, GPlayer>();

    public void setup() {

    }

    public GPlayer getGPlayer(Player player) {
        if (gPlayerMap.containsKey(player.getUniqueId())) {
            return gPlayerMap.get(player.getUniqueId());
        }

        gPlayerMap.put(player.getUniqueId(), new GPlayer(player));
        return gPlayerMap.get(player.getUniqueId());
    }

    public GPlayer getGPlayer(String playerName) {
        Player player = GoldenGunReboot.getInstance().getServer().getPlayer(playerName);
        if (gPlayerMap.containsKey(player.getUniqueId())) {
            return gPlayerMap.get(player.getUniqueId());
        }

        gPlayerMap.put(player.getUniqueId(), new GPlayer(playerName));
        return gPlayerMap.get(player.getUniqueId());
    }

    public GPlayer getGPlayer(UUID uuid) {
        if (gPlayerMap.containsKey(uuid)) {
            return gPlayerMap.get(uuid);
        }

        gPlayerMap.put(uuid, new GPlayer(uuid));
        return gPlayerMap.get(uuid);
    }
}
