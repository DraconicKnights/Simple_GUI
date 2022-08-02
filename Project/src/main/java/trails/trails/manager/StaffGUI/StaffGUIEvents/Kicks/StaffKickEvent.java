package trails.trails.manager.StaffGUI.StaffGUIEvents.Kicks;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks.ConfirmKickGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks.StaffGUIKick;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;

public class StaffKickEvent implements Listener {

    private StaffGUIKick gui;

    public StaffKickEvent() {
        gui = new StaffGUIKick();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getStaffKickgui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (event.getCurrentItem().getType() == Material.PLAYER_HEAD) {

            Player kicktarget = player.getServer().getPlayerExact(ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));

            ConfirmKickGUI confirmKickGUI = new ConfirmKickGUI();
            confirmKickGUI.RegisterConfirmKickgui(player, kicktarget);

            ConfirmKickGUI.openConfirmKickgui(player);

        }

        switch (event.getSlot()) {
            case 0:
                StaffGUI.openStaffgui(player);
                player.updateInventory();
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;

        }
    }

}
