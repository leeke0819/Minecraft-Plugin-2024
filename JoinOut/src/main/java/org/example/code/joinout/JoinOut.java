package org.example.code.joinout;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class JoinOut extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getLogger().info(ChatColor.GREEN+"JoinOut Plugin 이(가) 활성화 되었습니다.");

    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED+"JoinOut Plugin 이(가) 비활성화 되었습니다.");
    }

}