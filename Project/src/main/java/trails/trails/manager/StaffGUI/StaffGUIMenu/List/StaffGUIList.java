package trails.trails.manager.StaffGUI.StaffGUIMenu.List;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.Utils.ColourCode;
import trails.trails.manager.ArrayManagers.StaffArray;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;
import trails.trails.manager.StaffGUI.StaffGUIMenu.GUIDesign.StaffGUIDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StaffGUIList {

    private static Inventory staffgui;

    public void registerStaffListGUI(Player player) {

        ArrayList<Player> staffmemberlist = new ArrayList<>(Bukkit.getServer().getOnlinePlayers());

        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ColourCode.colour("&b&l" + "  <<<===Staff List===>>>")));

        //Close -- Closes the Staff GUI
        ItemStack closeitemStack = new ItemStack(Material.IRON_DOOR);
        ItemMeta closeitemMeta = closeitemStack.getItemMeta();
        closeitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "Close")));
        List<String> lore2 = new ArrayList<>();
        lore2.add("");
        lore2.add(ChatColor.RED + "Click to close the menu");
        closeitemMeta.setLore(lore2);
        closeitemStack.setItemMeta(closeitemMeta);
        inv.setItem(8, closeitemStack);

        // Return -- GUI
        ItemStack guiitemStack = new ItemStack(Material.CHEST);
        ItemMeta guiitemMeta = guiitemStack.getItemMeta();
        guiitemMeta.displayName(Component.text(ColourCode.colour("&6&l" + "Back")));
        List<String> lore9 = new ArrayList<>();
        lore9.add("");
        lore9.add(ChatColor.RED + "Click to return to main menu");
        guiitemMeta.setLore(lore9);
        guiitemStack.setItemMeta(guiitemMeta);
        inv.setItem(0, guiitemStack);

        //Design//

        //StaffList -- Nothing
        ItemStack staritemStack = new ItemStack(Material.COMPASS);
        ItemMeta staritemMeta = staritemStack.getItemMeta();
        staritemMeta.displayName(Component.text(ColourCode.colour("&d&l" + "Staff List")));
        List<String> lorestar = new ArrayList<>();
        lorestar.add("");
        lorestar.add(ChatColor.GOLD + "Total: " + ChatColor.LIGHT_PURPLE + StaffArray.getStafflist().size());
        staritemMeta.setLore(lorestar);
        staritemStack.setItemMeta(staritemMeta);
        inv.setItem(4, staritemStack);

        // Glass Pane -- Nothing
        ItemStack paneitemStack = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta paneitemMeta = paneitemStack.getItemMeta();
        paneitemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        paneitemStack.setItemMeta(paneitemMeta);
        inv.setItem(1, paneitemStack);

        // Glass Pane -- Nothing
        ItemStack pane1itemStack = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta pane1itemMeta = pane1itemStack.getItemMeta();
        pane1itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane1itemStack.setItemMeta(pane1itemMeta);
        inv.setItem(2, pane1itemStack);

        // Glass Pane -- Nothing
        ItemStack pane2itemStack = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta pane2itemMeta = pane2itemStack.getItemMeta();
        pane2itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane2itemStack.setItemMeta(pane2itemMeta);
        inv.setItem(3, pane2itemStack);

        // Glass Pane -- Nothing
        ItemStack pane3itemStack = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta pane3itemMeta = pane3itemStack.getItemMeta();
        pane3itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane3itemStack.setItemMeta(pane3itemMeta);
        inv.setItem(5, pane3itemStack);

        // Glass Pane -- Nothing
        ItemStack pane4itemStack = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta pane4itemMeta = pane4itemStack.getItemMeta();
        pane4itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane4itemStack.setItemMeta(pane4itemMeta);
        inv.setItem(6, pane4itemStack);

        // Glass Pane -- Nothing
        ItemStack pane5itemStack = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta pane5itemMeta = pane5itemStack.getItemMeta();
        pane5itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane5itemStack.setItemMeta(pane5itemMeta);
        inv.setItem(7, pane5itemStack);

        staffmemberlist.removeIf(s -> !s.hasPermission(PermMessage.STAFF));

        for (int i = 0; i < staffmemberlist.size(); i++) {

            if (staffmemberlist.get(i).hasPermission(PermMessage.STAFF)) {
                ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
                ItemMeta playerMeta = playerHead.getItemMeta();

                playerMeta.displayName(staffmemberlist.get(i).displayName());
                ArrayList lore = new ArrayList<>();
                lore.add(ChatColor.GOLD + "World: " + ChatColor.AQUA + staffmemberlist.get(i).getWorld().getName());
                if (player.hasPermission("staff.management")) {
                    lore.add(ChatColor.GOLD + "UUID: " + ChatColor.AQUA + staffmemberlist.get(i).getUniqueId());
                    lore.add(ChatColor.GOLD + "Gamemode: " + ChatColor.AQUA + staffmemberlist.get(i).getGameMode());
                    lore.add(ChatColor.GOLD + "Staff: " + ChatColor.GOLD + "Yes");
                }
                playerMeta.setLore(lore);
                playerHead.setItemMeta(playerMeta);
                inv.addItem(playerHead);
            } else {
                ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
                ItemMeta playerMeta = playerHead.getItemMeta();

                playerMeta.displayName(staffmemberlist.get(i).displayName());
                ArrayList lore = new ArrayList<>();
                lore.add(ChatColor.GOLD + "World: " + ChatColor.AQUA + staffmemberlist.get(i).getWorld().getName());
                if (player.hasPermission("staff.management")) {
                    lore.add(ChatColor.GOLD + "UUID: " + ChatColor.AQUA + staffmemberlist.get(i).getUniqueId());
                    lore.add(ChatColor.GOLD + "Gamemode: " + ChatColor.AQUA + staffmemberlist.get(i).getGameMode());
                    lore.add(ChatColor.GOLD + "Staff: " + ChatColor.RED + "No");
                }
                playerMeta.setLore(lore);
                playerHead.setItemMeta(playerMeta);
                inv.addItem(playerHead);
            }


        }

        setStafflistgui(inv);

    }

    public Inventory getStafflistgui() {
        return staffgui;
    }

    public void setStafflistgui(Inventory inv) {
        staffgui = inv;
    }

    public static void openStaffListgui(Player player) {
        player.openInventory(staffgui);
    }

}
