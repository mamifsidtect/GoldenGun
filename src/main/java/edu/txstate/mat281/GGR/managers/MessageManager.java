package edu.txstate.mat281.GGR.managers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MessageManager {

    public enum MessagesType {

        INFO(ChatColor.GRAY),
        GOOD(ChatColor.GREEN),
        BAD(ChatColor.RED);

        private ChatColor color;

        MessagesType(ChatColor color) {
            this.color = color;
        }

        public ChatColor getColor() {
            return color;
        }
    }

    private MessageManager() { }

    private static MessageManager instance = new MessageManager();

    public static MessageManager getInstance() {
        return instance;
    }

    private String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "Golden"
            + ChatColor.GOLD + "Gun" + ChatColor.DARK_GRAY + "] " + ChatColor.RESET;

    public void msg(CommandSender sender, MessagesType type, String... messages) {
        for (String msg : messages) {
            sender.sendMessage(prefix + type.getColor() + msg);
        }
    }

    public void broadcast(MessagesType type, String... messages) {
        for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            for (String msg : messages) {
                p.sendMessage(prefix + type.getColor() + msg);
            }
        }
    }
}
