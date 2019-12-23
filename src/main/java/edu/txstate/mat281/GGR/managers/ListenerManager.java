package edu.txstate.mat281.GGR.managers;

import edu.txstate.mat281.GGR.GoldenGunReboot;
import edu.txstate.mat281.GGR.listeners.GameListener;
import edu.txstate.mat281.GGR.listeners.JoinListener;
import edu.txstate.mat281.GGR.listeners.LeaveListener;
import edu.txstate.mat281.GGR.listeners.WandListener;
import org.bukkit.Bukkit;

public class ListenerManager {

    public void setup() {
        Bukkit.getServer().getPluginManager().registerEvents(new JoinListener(), GoldenGunReboot.getInstance());
        Bukkit.getServer().getPluginManager().registerEvents(new LeaveListener(), GoldenGunReboot.getInstance());
        Bukkit.getServer().getPluginManager().registerEvents(new GameListener(), GoldenGunReboot.getInstance());
        Bukkit.getServer().getPluginManager().registerEvents(new WandListener(), GoldenGunReboot.getInstance());
    }
}
