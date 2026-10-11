package com.forbdkb.antiopguard;

import org.bukkit.plugin.java.JavaPlugin;

public final class AntiOpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OpCommandListener(), this);
        getLogger().info("AntiOpGuard enabled! OP commands are now console-only.");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiOpGuard disabled.");
    }
}
