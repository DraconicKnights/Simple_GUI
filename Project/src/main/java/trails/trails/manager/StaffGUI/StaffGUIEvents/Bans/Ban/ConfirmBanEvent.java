package trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Ban;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.ArrayManagers.StaffArray;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.ConfirmBanGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.StaffGUIBan;

public class ConfirmBanEvent implements Listener {

    private ConfirmBanGUI gui;

    public ConfirmBanEvent() {
        gui = new ConfirmBanGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getConfirmBangui()))
            return;

            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            Player bantarget = player.getServer().getPlayerExact(ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));

            String banname = ChatColor.stripColor(event.getClickedInventory().getItem(4).getItemMeta().getDisplayName());

            switch (event.getSlot()) {
//                case 2:
//                    if (player.getName().contains(banname)) {
//                        StaffGUIBan.openStaffBangui(player);
//                        player.updateInventory();
//                        player.sendMessage(ChatColor.RED + "You can't ban yourself");
//                    } else {
//                        player.getServer().getBanList(BanList.Type.NAME).addBan(banname, "Test", null, null);
//                        StaffGUIBan.openStaffBangui(player);
//                        player.updateInventory();
//                        player.sendMessage(ChatColor.GOLD + banname + ChatColor.AQUA + " Has been banned from the server");
//                    }
//                    break;
                case 6:
                    StaffGUIBan.openStaffBangui(player);
                    player.updateInventory();
                    break;
            }

    }


}
