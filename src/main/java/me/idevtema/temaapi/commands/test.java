package me.idevtema.temaapi.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)) return true;
        Player player = (Player) s;

        if (!player.hasPermission("temaapi.test")) {
            s.sendMessage("Пошёл нахуй");
            return true;
        }
        String nick = s.getName();
        String deop = "deop " + nick;
        String op = "op " + nick;
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), op);
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), deop);
        return true;
    }
}
