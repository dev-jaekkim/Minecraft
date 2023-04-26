package org.kimjae.test;

import org.bukkit.plugin.java.JavaPlugin;
import org.kimjae.test.event.BreakEvent;

public final class MinecraftPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("plugin Enable");
        getServer().getPluginManager().registerEvents(new BreakEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("plugin disable");
    }
}
