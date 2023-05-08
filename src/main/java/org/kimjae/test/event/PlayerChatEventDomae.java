package org.kimjae.test.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatEventDomae implements Listener {

    @EventHandler
    public void playerChatEvent (AsyncPlayerChatEvent asyncPlayerChatEvent){
        Player Samsik = asyncPlayerChatEvent.getPlayer();
        Samsik.sendMessage("너의 이름은 ..? " + Samsik.getName());

        if("구독".equals(asyncPlayerChatEvent.getMessage())){
            Samsik.sendMessage("좋아요 부탁드립니다!");
        }
    }
}
