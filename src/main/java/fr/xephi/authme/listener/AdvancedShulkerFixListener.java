package fr.xephi.authme.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

//This fix is only for Minecraft 1.13-
public class AdvancedShulkerFixListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onDispenserActivate(BlockDispenseEvent event) {
        Block block = event.getBlock();

        if (block.getRelative(BlockFace.DOWN).getType().equals(Material.AIR) && block.getY() == 0) {
            event.setCancelled(true);
        }
        if (block.getRelative(BlockFace.UP).getType().equals(Material.AIR)) {
            if (block.getY() == block.getWorld().getMaxHeight() - 1) {
                event.setCancelled(true);
            }
        }
    }
}