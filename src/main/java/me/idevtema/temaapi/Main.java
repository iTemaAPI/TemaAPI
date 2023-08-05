package me.idevtema.temaapi;

import me.idevtema.temaapi.commands.gm.gma;
import me.idevtema.temaapi.commands.gm.gmc;
import me.idevtema.temaapi.commands.gm.gms;
import me.idevtema.temaapi.commands.gm.gmsp;
import me.idevtema.temaapi.commands.info;
import me.idevtema.temaapi.commands.test;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("info").setExecutor(new info());
        getCommand("test").setExecutor(new test());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gma").setExecutor(new gma());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        Bukkit.getServer().getLogger().info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Bukkit.getServer().getLogger().info("Загружаю необходимые классы...");
        Bukkit.getServer().getLogger().info("Класс info.class запустился");
        Bukkit.getServer().getLogger().info("Класс test.class запустился");
        Bukkit.getServer().getLogger().info("Все необходимые классы запустились");
        Bukkit.getServer().getLogger().info("Плагин запустился");
        Bukkit.getServer().getLogger().info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Bukkit.getServer().getLogger().info("Выгружаем все классы. Выключение.");
        Bukkit.getServer().getLogger().info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
