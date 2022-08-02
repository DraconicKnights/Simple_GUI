package trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Unban;

import org.bukkit.BanList;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.ArrayManagers.StaffArray;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.StaffGUIBan;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban.StaffUnbanGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban.UnbanConfirmGUI;

public class ConfirmUnbanEvent implements Listener {

    private UnbanConfirmGUI gui;

    public ConfirmUnbanEvent() {
        gui = new UnbanConfirmGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getUnbanConfirmgui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        Player unbantarget = player.getServer().getPlayerExact(ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));

        String unbanname = ChatColor.stripColor(event.getClickedInventory().getItem(4).getItemMeta().getDisplayName());

        switch (event.getSlot()) {
//            case 2:
//                if (!player.hasPermission(PermMessage.STAFF_UNBAN)) {
//                    player.closeInventory();
//                    player.updateInventory();
//                    player.sendMessage(ChatColor.RED + "You don't have permission to use this command");
//                } else {
//                    player.getServer().getBanList(BanList.Type.NAME).pardon(unbanname);
//                    StaffArray.removeBanList(unbantarget);
//                    StaffUnbanGUI.openStaffUnbangui(player);
//                    player.updateInventory();
//                    player.sendMessage(ChatColor.GOLD + unbanname + ChatColor.AQUA + " Has been unbanned from the server");
//                }
//                break;
            case 6:
                StaffUnbanGUI.openStaffUnbangui(player);
                player.updateInventory();
                break;
        }

    }

}
