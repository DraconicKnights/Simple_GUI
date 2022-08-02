package trails.trails.manager.StaffGUI.StaffGUIEvents.Fun;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import trails.trails.manager.ArrayManagers.StaffArray;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.FreezeGUIMenu;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.StaffGUIFreeze;

import java.util.ArrayList;
import java.util.UUID;

public class FreezeMenuEvent implements Listener {

    ArrayList<Object> Frozenplayers = new ArrayList<>();

    private FreezeGUIMenu gui;

    private StaffArray staffArray;

    public FreezeMenuEvent() {
        gui = new FreezeGUIMenu();
    }


    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getFreezeguimenu()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        String target = ChatColor.stripColor(event.getClickedInventory().getItem(4).getItemMeta().getDisplayName());

        switch (event.getSlot()) {
            case 1:
                if (player.getName().contains(target)) {
                    StaffGUIFreeze.openStaffFreezegui(player);
                    player.updateInventory();
                    player.sendMessage(ChatColor.RED + "You can't freeze yourself");
                } else {
                    Frozenplayers.add(target);
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GOLD + target + ChatColor.AQUA + " Has been frozen");
                }
                break;
            case 2:
                if (player.getName().contains(target)) {
                    StaffGUIFreeze.openStaffFreezegui(player);
                    player.updateInventory();
                    player.sendMessage(ChatColor.RED + "You can't unfreeze yourself");
                } else {
                    Frozenplayers.remove(target);
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GOLD + target + ChatColor.AQUA + " Has been unfrozen");
                }
            case 6:
                StaffGUIFreeze.openStaffFreezegui(player);
                player.updateInventory();
                break;
        }

    }

    @EventHandler
    public void MoveEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (Frozenplayers.contains(player.getName())) {
            player.sendMessage(ChatColor.AQUA + "You have been frozen");
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void LeaveEvent(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if (Frozenplayers.contains(player.getName())) {
            Frozenplayers.remove(player);
        }
    }

}
