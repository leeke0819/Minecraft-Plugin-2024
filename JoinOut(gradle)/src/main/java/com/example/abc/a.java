package com.example.abc;

import org.bukkit.plugin.java.JavaPlugin;
public class a extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enable plugin");
    }
    @Override
    public void onDisable() {
        getLogger().info("Disable plugin");
    }
}