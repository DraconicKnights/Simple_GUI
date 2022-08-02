package trails.trails.manager.StaffGUI.StaffGUIEvents.Kicks;

import org.bukkit.BanList;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.ArrayManagers.StaffArray;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.StaffGUIBan;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks.ConfirmKickGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks.StaffGUIKick;

public class ConfirmKickEvent implements Listener {

    private ConfirmKickGUI gui;

    public ConfirmKickEvent() {
        gui = new ConfirmKickGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getConfirmKickgui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        String kickname = ChatColor.stripColor(event.getClickedInventory().getItem(4).getItemMeta().getDisplayName());

        switch (event.getSlot()) {
            case 2:
                if (player.getName().contains(kickname)) {
                    StaffGUIKick.openStaffKickgui(player);
                    player.updateInventory();
                    player.sendMessage(ChatColor.RED + "You can't kick yourself");
                } else {
                    player.getServer().getPlayer(kickname).kick();
                    StaffGUIKick.openStaffKickgui(player);
                    player.updateInventory();
                    player.sendMessage(ChatColor.GOLD + kickname + ChatColor.AQUA + " Has been kicked from the server");
                }
                break;
            case 6:
                StaffGUIKick.openStaffKickgui(player);
                player.updateInventory();
                break;
        }

    }

}
