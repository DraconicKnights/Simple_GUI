package trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Ban;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.ConfirmBanGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.StaffGUIBan;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban.StaffUnbanGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;

import java.util.Objects;

public class StaffBanEvent implements Listener {

    private StaffGUIBan gui;

    public StaffBanEvent() {
        gui = new StaffGUIBan();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getStaffBangui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        //Check to see if players clicked then passed to ConfirmBanGUI

        if (Objects.requireNonNull(event.getCurrentItem()).getType() == Material.PLAYER_HEAD) {

            Player bantarget = player.getServer().getPlayerExact(ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));

            ConfirmBanGUI confirmBanGUI = new ConfirmBanGUI();
            confirmBanGUI.registerConfirmBanGUI(player, bantarget);

            ConfirmBanGUI.openConfirmBangui(player);

        }

        //Switch for GUI

        switch (event.getSlot()) {
            case 0:
                StaffGUI.openStaffgui(player);
                player.updateInventory();
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;
            case 4:
                if (player.hasPermission(PermMessage.STAFF_UNBAN)) {
                    StaffUnbanGUI.openStaffUnbangui(player);
                    player.updateInventory();
                } else {
                    player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
                    player.updateInventory();
                }
                break;

        }

    }
}
