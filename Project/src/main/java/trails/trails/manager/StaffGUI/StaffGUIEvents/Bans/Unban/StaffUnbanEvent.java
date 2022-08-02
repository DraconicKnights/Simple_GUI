package trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Unban;

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
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban.UnbanConfirmGUI;

import java.util.Objects;

public class StaffUnbanEvent implements Listener {

    private StaffUnbanGUI gui;

    public StaffUnbanEvent() {
        gui = new StaffUnbanGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getStaffUnbangui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (Objects.requireNonNull(event.getCurrentItem()).getType() == Material.PLAYER_HEAD && player.hasPermission(PermMessage.STAFF_UNBAN)) {

            Player unbantarget = player.getServer().getPlayerExact(ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));

            UnbanConfirmGUI unbanConfirmGUI = new UnbanConfirmGUI();
            unbanConfirmGUI.registerUnbanConfirmGUI(player, unbantarget);

            UnbanConfirmGUI.openConfirmUnbangui(player);

        } else if (!player.hasPermission(PermMessage.STAFF_UNBAN)) {
            player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
            player.updateInventory();
        }
        //Switch for GUI

        switch (event.getSlot()) {
            case 0:
                StaffGUIBan.openStaffBangui(player);
                player.updateInventory();
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;

        }

    }

}
