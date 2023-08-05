package me.idevtema.temaapi.commands.gm;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmsp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)) return true;
        Player player = (Player) s;

        if (!player.hasPermission("temaapi.gm.gmsp")) {
            s.sendMessage("Пошёл нахуй");
            return true;
        }
        ((Player) s).setGameMode(GameMode.SPECTATOR);
        player.sendMessage(" ");
        player.sendMessage("Ваш игровой режим изменён на " + ChatColor.GREEN + "Спектатор");
        player.sendMessage(" ");
        return true;
    }
}
