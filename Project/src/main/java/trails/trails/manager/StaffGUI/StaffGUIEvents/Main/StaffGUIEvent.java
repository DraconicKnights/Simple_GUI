package trails.trails.manager.StaffGUI.StaffGUIEvents.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.StaffGUIBan;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.StaffGUIFreeze;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks.StaffGUIKick;
import trails.trails.manager.StaffGUI.StaffGUIMenu.List.StaffGUIList;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Management.StaffManagementGUI;

public class StaffGUIEvent implements Listener {

    private StaffGUI gui;

    public StaffGUIEvent() {
        gui = new StaffGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getStaffgui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        switch (event.getSlot()) {
            case 0:
                player.updateInventory();
                player.sendMessage(ChatColor.RED + "Work in Progress");
                break;
            case 4:
                if (!player.hasPermission(PermMessage.MANAGEMENT)) {
                    player.updateInventory();
                    player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
                }
                StaffManagementGUI.openManagegui(player);
                player.updateInventory();
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;
            case 14:
                if (player.hasPermission("staff.freeze")) {
                    StaffGUIFreeze.openStaffFreezegui(player);
                    player.updateInventory();
                } else {
                    player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
                }
                break;
            case 20:
                player.updateInventory();
                player.sendMessage(ChatColor.RED + "Work in Progress");
            case 24:
                if (player.hasPermission("staff.kick")) {
                    StaffGUIKick.openStaffKickgui(player);
                    player.updateInventory();
                } else {
                    player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
                }
                break;
            case 34:
                if (player.hasPermission("staff.ban")) {
                    StaffGUIBan.openStaffBangui(player);
                    player.updateInventory();
                } else {
                    player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
                }
                break;
        }
    }

}
