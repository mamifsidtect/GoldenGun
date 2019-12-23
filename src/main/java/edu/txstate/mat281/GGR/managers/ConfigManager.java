package edu.txstate.mat281.GGR.managers;

import edu.txstate.mat281.GGR.GoldenGunReboot;
import org.bukkit.Location;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    public void setup() {

    }

    public FileConfiguration getArenaConfig() {
        try {
            return GoldenGunReboot.getInstance().get;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public FileConfiguration getPlayerConfig() {
        return GoldenGunReboot.getInstance().getConfig().load("players.yml");
    }

    public FileConfiguration getGameConfig() {
        return GoldenGunReboot.getInstance().getConfig().load("games.yml");
    }

    public FileConfiguration getLoadoutConfig() {
        return GoldenGunReboot.getInstance().getConfig().load("loadouts.yml");
    }

    public void locationToConfig(Location location, String configName, String configPath) {

    }

    public Location locationFromConfig(String configName, String configPath) {
        return null;
    }

    public void inventoryToConfig(Player player, String configName, String configPath) {

    }

    public Inventory inventoryFromConfig(String configName, String configPath) {
        return null;
    }
}
