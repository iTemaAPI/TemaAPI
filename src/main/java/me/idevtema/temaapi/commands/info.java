package me.idevtema.temaapi.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.Location;

public class info implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)) return true;
        Player player = (Player) s;

        if (!player.hasPermission("temaapi.info")) {
            s.sendMessage("Пошёл нахуй");
            return true;
        }
        // String X = Bukkit.getPlayer().getLocation().getX();
        // String Y = Bukkit.getPlayer().getLocation().getY();
        // String Z = Bukkit.getPlayer().getLocation().getZ();
            String ping = String.valueOf((((Player) s).getPing()));
            String nick = s.getName();
            String ip = "Comming soon...";
        //  String ip = ((Player) s).getPlayer().getServer().getIp();
        //  player.sendMessage("Ваши координаты: " + ChatColor.GREEN + "X" + X + "Y" + Y + "Z" + Z);
            Location l = player.getLocation();
            ((Entity) s).getLocation();
            ((Entity) s).getLocation();
            player.sendMessage(" ");
            player.sendMessage("Ваш ник: " + ChatColor.GREEN + nick);
            player.sendMessage(" ");
            player.sendMessage("Ваши координаты: " + ChatColor.GREEN + "X:" + ((int) l.getX()) + " " + ChatColor.GREEN + "Y:" + ((int) l.getY()) + " " + ChatColor.GREEN + "Z:" + ((int) l.getZ()));
            player.sendMessage(" ");
            player.sendMessage("Ваш пинг: " + ChatColor.GREEN + ping);
            player.sendMessage(" ");
            // player.sendMessage("Ваш IP: " + ChatColor.GREEN + ip);
            player.sendMessage("Ваш IP: " + ChatColor.ITALIC + ChatColor.GRAY + ip);
            player.sendMessage(" ");
        return true;
    }
}