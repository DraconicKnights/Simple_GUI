package trails.trails.manager.StaffGUI.StaffGUIEvents.Fun;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban.UnbanConfirmGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.FreezeGUIMenu;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.StaffGUIFreeze;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;

import java.util.Objects;

public class StaffFreezeEvent implements Listener {

    private StaffGUIFreeze gui;

    public StaffFreezeEvent() {
        gui = new StaffGUIFreeze();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getStaffFreezegui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (!player.hasPermission(PermMessage.STAFF_FREEZE)) {
            player.sendMessage(ChatColor.RED + PermMessage.NO_PERMISSION);
            player.updateInventory();
            return;
        }

        if (Objects.requireNonNull(event.getCurrentItem()).getType() == Material.PLAYER_HEAD) {

            Player target = player.getServer().getPlayerExact(ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));

            FreezeGUIMenu freezeGUIMenu = new FreezeGUIMenu();
            freezeGUIMenu.registerFreezeGUIMenu(player, target);

            FreezeGUIMenu.openFreezeguiMenu(player);

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
