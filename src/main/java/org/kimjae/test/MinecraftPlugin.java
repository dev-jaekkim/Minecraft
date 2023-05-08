package org.kimjae.test;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.kimjae.test.event.BreakEvent;
import org.kimjae.test.event.PlayerMoveEventDomae;

public final class MinecraftPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("plugin Enable");
        getServer().getPluginManager().registerEvents(new BreakEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerMoveEventDomae(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("plugin disable");
    }


}
