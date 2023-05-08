package org.kimjae.test.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerMoveEventDomae implements Listener {

    @EventHandler
    public void playerMoving(org.bukkit.event.player.PlayerMoveEvent playerMoveEvent){
        Player yangdding = playerMoveEvent.getPlayer();
        yangdding.sendMessage("양띵 움직이고있음!");
    }
}
