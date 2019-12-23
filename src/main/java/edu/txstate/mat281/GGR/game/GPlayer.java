package edu.txstate.mat281.GGR.game;

import edu.txstate.mat281.GGR.GoldenGunReboot;
import edu.txstate.mat281.GGR.managers.ConfigManager;
import org.bukkit.entity.Player;

import java.util.UUID;

public class GPlayer {

    UUID uuid;
    Boolean inGame, inLobby, OP;

    public GPlayer(Player player) {
        uuid = player.getUniqueId();
        inGame = false;
        inLobby = true;

        OP =
    }

    public GPlayer(UUID uuid) {
        this.uuid = uuid;
    }

    public GPlayer(String playerName) {
        uuid = GoldenGunReboot.getInstance().getServer().getPlayer(playerName).getUniqueId();
    }

    public UUID getUuid() {
        return uuid;
    }

    public Player getBPlayer() {
        return GoldenGunReboot.getInstance().getServer().getPlayer(uuid);
    }

    public boolean isInGame() {
        return inGame;
    }

    public boolean isInLobby() {
        return inLobby;
    }

    public boolean isOP() {
        return OP;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public void setInLobby(boolean inLobby) {
        this.inLobby = inLobby;
    }

    public void setOP(boolean op) {
        this.OP = op;
    }
}
