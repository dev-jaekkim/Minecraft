package org.kimjae.test.event;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakEvent implements Listener {

    private final ItemStack normalDiamondStack = new ItemStack(Material.DIAMOND,1);

    @EventHandler
    public void breakDirt (BlockBreakEvent blockBreakEvent) {
        Material playersMaterial = blockBreakEvent.getBlock().getBlockData().getMaterial();

        if(Material.DIRT.equals(playersMaterial) || Material.GRASS_BLOCK.equals(playersMaterial)) {
            if(Math.floor((Math.random() * 10)) < 5){
                Player yangdding = blockBreakEvent.getPlayer();
                yangdding.getInventory().addItem(normalDiamondStack);
                yangdding.sendMessage("You have found a diamond! Congrats!");
            }
        }
    }
}
