package trails.trails.manager.StaffGUI.StaffGUIEvents.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.StaffGUIFreeze;
import trails.trails.manager.StaffGUI.StaffGUIMenu.List.StaffGUIList;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Management.StaffManagementGUI;

public class StaffListEvent implements Listener {

    private StaffGUIList gui;

    public StaffListEvent() {
        gui = new StaffGUIList();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getStafflistgui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        switch (event.getSlot()) {
            case 0:
                StaffManagementGUI.openManagegui(player);
                player.updateInventory();
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;

        }
    }
}

