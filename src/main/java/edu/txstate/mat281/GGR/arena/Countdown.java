package edu.txstate.mat281.GGR.arena;

import edu.txstate.mat281.GGR.managers.MessageManager;
import org.bukkit.entity.Player;

public class Countdown {

    private boolean isDone;
    private int length;
    private Arena arena;
    private String futureTense, presentTense;

    public Countdown(int length, Arena arena, String futureTense, String presentTense) {
        this.length = length;
        this.arena = arena;
        this.futureTense = futureTense;
        this.presentTense = presentTense;
        this.isDone = false;
    }

    /**
     * BOILER PLATE CODE.
     * TODO: COME BACK AND UPDATE AND REVISE THIS CLASS
     *
    public void run() {
        if (isDone) {
            return;
        }

        if (length == 0) {
            arena.sendMessage(MessageManager.MessagesType.INFO, "The game is now " + getPresentTense());
            isDone = true;
            return;
        }

        String suffix;

        length--;

        for (PlayerManager.PlayerData playerData : getArena().getPlayerManager().getPlayerData()) {
            Player player = playerData.getPlayer().getPlayer();
            player.setExp(1.0F);
            player.setLevel(length);
        }

        if (length % 60 == 0 && length != 60) {
            suffix = " minutes";
            for (PlayerData playerData : getArena().getPlayerManager().getPlayerData()) {
                ActionBar.sendActionBar(playerData.getPlayer().getPlayer(),
                        ChatColor.GREEN + "The game " + getFutureTense() + " in " + ChatColor.YELLOW + length / 60 + ChatColor.GREEN + suffix);
            }
            return;
        }

        if (length <= 15 && length > 1) {
            suffix = " seconds";
            for (PlayerData playerData : getArena().getPlayerManager().getPlayerData()) {
                ActionBar.sendActionBar(playerData.getPlayer().getPlayer(),
                        ChatColor.GREEN + "The game " + getFutureTense() + " in " + ChatColor.YELLOW + length + ChatColor.GREEN + suffix);
            }
            return;
        }

        if (length == 1) {
            suffix = " second";
            for (PlayerData playerData : getArena().getPlayerManager().getPlayerData()) {
                ActionBar.sendActionBar(playerData.getPlayer().getPlayer(),
                        ChatColor.GREEN + "The game " + getFutureTense() + " in " + ChatColor.YELLOW + length + ChatColor.GREEN + suffix);
            }
            return;
        }

        if (length == 60) {
            suffix = " minute";
            for (PlayerData playerData : getArena().getPlayerManager().getPlayerData()) {
                ActionBar.sendActionBar(playerData.getPlayer().getPlayer(),
                        ChatColor.GREEN + "The game " + getFutureTense() + " in " + ChatColor.YELLOW + length/60 + ChatColor.GREEN + suffix);
            }
        }
    }
     */

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public boolean isDone() {
        return isDone;
    }

    public int getLength() {
        return length;
    }

    public Arena getArena() {
        return arena;
    }

    public String getFutureTense() {
        return futureTense;
    }

    public String getPresentTense() {
        return presentTense;
    }
}
