package trails.trails.manager.StaffGUI.StaffGUIEvents.Management;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.StaffGUI.StaffGUIMenu.List.StaffGUIList;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Management.StaffManagementGUI;

public class ManagementGUIEvent implements Listener {

    private StaffManagementGUI staffManagementGUI;

    public ManagementGUIEvent() {
        staffManagementGUI = new StaffManagementGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(staffManagementGUI.getManagegui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        switch (event.getSlot()) {
            case 0:
                StaffGUI.openStaffgui(player);
                player.updateInventory();
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;
            case 14:
                player.sendMessage(ChatColor.RED + "Work in Progress");
                player.updateInventory();
                break;
            case 12:
                StaffGUIList.openStaffListgui(player);
                player.updateInventory();
                break;
        }
    }
}
