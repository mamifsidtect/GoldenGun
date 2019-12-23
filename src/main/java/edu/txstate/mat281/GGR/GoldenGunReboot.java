package edu.txstate.mat281.GGR;

import edu.txstate.mat281.GGR.managers.*;
import org.bukkit.plugin.java.JavaPlugin;

public class GoldenGunReboot extends JavaPlugin {

    private static GoldenGunReboot instance;

    private PlayerManager playerManager;
    private ListenerManager listenerManager;
    private ConfigManager configManager;
    private CommandManager commandManager;
    private ArenaManager arenaManager;
    private GameManager gameManager;

    public static GoldenGunReboot getInstance() {
        if (instance == null) {
            return new GoldenGunReboot();
        }

        return instance;
    }

    @Override
    public void onEnable() {
        //MAKE SURE TO KEEP THIS RIGHT HERE
        instance = this;

        playerManager = new PlayerManager();
        listenerManager = new ListenerManager();
        configManager = new ConfigManager();
        commandManager = new CommandManager();
        arenaManager = new ArenaManager();
        gameManager = new GameManager();

        loadManagers();
    }

    @Override
    public void onDisable() {
        playerManager = null;
        listenerManager = null;
        configManager = null;
        commandManager = null;
        arenaManager = null;
        gameManager = null;

        //KEEP THIS ONE AT THE END OF YOUR DISABLE
        instance = null;
    }

    private void loadManagers() {
        playerManager.setup();
        listenerManager.setup();
        configManager.setup();
        commandManager.setup();
        arenaManager.setup();
        gameManager.setup();
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    public ListenerManager getListenerManager() {
        return listenerManager;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public ArenaManager getArenaManager() {
        return arenaManager;
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}
