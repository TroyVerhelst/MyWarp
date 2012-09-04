package me.taylorkelly.mywarp.listeners;

import me.taylorkelly.mywarp.MyWarp;
import me.taylorkelly.mywarp.WarpSettings;
import me.taylorkelly.mywarp.permissions.WarpPermissions;
import me.taylorkelly.mywarp.timer.PlayerWarmup;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class MWEntityListener implements Listener {
    
    private WarpPermissions warpPermissions;
    
    public MWEntityListener() {
        warpPermissions = MyWarp.getWarpPermissions();
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.isCancelled() || !(event.getEntity() instanceof Player)
                || !WarpSettings.abortOnDamage) {
            return;
        }

        Player victim = (Player) event.getEntity();

        if (PlayerWarmup.isActive(victim.getName()) && !warpPermissions.disobeyWarmupDmgAbort(victim)) {
            PlayerWarmup.endTimer(victim.getName());
            victim.sendMessage(ChatColor.RED
                    + " You mustn't take damage while warming up. Your "
                    + ChatColor.RESET + "/warp" + ChatColor.RED + " was canceled.");
        }
    }
}
