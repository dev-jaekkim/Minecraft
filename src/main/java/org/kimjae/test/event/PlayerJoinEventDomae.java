package org.kimjae.test.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEventDomae implements Listener {

    @EventHandler
    public void newbieHasCome(PlayerJoinEvent playerJoinEvent) {
        Player Seoneng = playerJoinEvent.getPlayer();
        Seoneng.sendMessage("서넹이가 왔도다!");
    }
}
