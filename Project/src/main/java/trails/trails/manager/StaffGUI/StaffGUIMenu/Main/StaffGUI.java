package trails.trails.manager.StaffGUI.StaffGUIMenu.Main;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;

import java.util.ArrayList;
import java.util.List;

import trails.trails.Utils.ColourCode;

public class StaffGUI {

    private static Inventory staffgui;

    public void registerGUI(Player player) {

        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ColourCode.colour("&b&l" + "  <<<===Staff Menu===>>>")));

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

        //Report -- Staff Reports
        ItemStack reportitemStack = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta reportitemMeta = reportitemStack.getItemMeta();
        reportitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "Work in Progress")));
        List<String> loresreport = new ArrayList<>();
        loresreport.add("");
        loresreport.add(ChatColor.RED + "Work in Progress");
        reportitemMeta.setLore(loresreport);
        reportitemStack.setItemMeta(reportitemMeta);
        inv.setItem(0, reportitemStack);

        if (player.hasPermission(PermMessage.MANAGEMENT)) {
            //Star -- Management/Staff View
            ItemStack staritemStack = new ItemStack(Material.NETHER_STAR);
            ItemMeta staritemMeta = staritemStack.getItemMeta();
            staritemMeta.displayName(Component.text(ColourCode.colour("&d&l" + "Management")));
            List<String> lorestar = new ArrayList<>();
            lorestar.add("");
            lorestar.add(ChatColor.AQUA + "Click to view the management page");
            staritemMeta.setLore(lorestar);
            staritemStack.setItemMeta(staritemMeta);
            inv.setItem(4, staritemStack);
        } else {
            //Star -- Management/Staff View
            ItemStack staritemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta staritemMeta = staritemStack.getItemMeta();
            staritemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "No Access")));
            List<String> lorestar = new ArrayList<>();
            lorestar.add("");
            lorestar.add(ChatColor.RED + PermMessage.NO_PERMISSION);
            staritemMeta.setLore(lorestar);
            staritemStack.setItemMeta(staritemMeta);
            inv.setItem(4, staritemStack);
        }

        if (player.hasPermission(PermMessage.STAFF)) {
            // Player List -- GUI
            ItemStack listitemStack = new ItemStack(Material.COMPASS);
            listitemStack.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);
            ItemMeta listitemMeta = listitemStack.getItemMeta();
            listitemMeta.displayName(Component.text(ColourCode.colour("&6&l" + "Player's Online")));
            List<String> lore3 = new ArrayList<>();
            lore3.add("");
            lore3.add(ChatColor.AQUA + "Click to view players currently online");
            listitemMeta.setLore(lore3);
            listitemStack.setItemMeta(listitemMeta);
            inv.setItem(12, listitemStack);
        } else {
            // Player List -- GUI
            ItemStack listitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta listitemMeta = listitemStack.getItemMeta();
            listitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "No Access")));
            List<String> lore3 = new ArrayList<>();
            lore3.add("");
            lore3.add(ChatColor.RED + "You don't have access to this");
            listitemMeta.setLore(lore3);
            listitemStack.setItemMeta(listitemMeta);
            inv.setItem(12, listitemStack);
        }

        if (player.hasPermission(PermMessage.STAFF_FREEZE)) {
            // Staff Freeze -- GUI
            ItemStack freezeitemStack = new ItemStack(Material.BLAZE_ROD);
            ItemMeta freezeitemMeta = freezeitemStack.getItemMeta();
            freezeitemMeta.displayName(Component.text(ColourCode.colour("&6&l" + "Freeze")));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.AQUA + "Click to see the staff freeze");
            freezeitemMeta.setLore(lore4);
            freezeitemStack.setItemMeta(freezeitemMeta);
            inv.setItem(14, freezeitemStack);
        } else {
            // Staff Freeze -- GUI
            ItemStack freezeitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta freezeitemMeta = freezeitemStack.getItemMeta();
            freezeitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "No Access")));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.RED + "You don't have access to this");
            freezeitemMeta.setLore(lore4);
            freezeitemStack.setItemMeta(freezeitemMeta);
            inv.setItem(14, freezeitemStack);
        }

        if (player.hasPermission(PermMessage.STAFF_KICK)) {
            // Staff Kick -- GUI
            ItemStack kickitemStack = new ItemStack(Material.WOODEN_AXE);
            ItemMeta kickitemMeta = kickitemStack.getItemMeta();
            kickitemMeta.displayName(Component.text(ColourCode.colour("&6&l" + "Kick")));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.AQUA + "Click to see the staff kicks");
            kickitemMeta.setLore(lore4);
            kickitemStack.setItemMeta(kickitemMeta);
            inv.setItem(24, kickitemStack);
        } else {
            // Staff Kick -- GUI
            ItemStack kickitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta kickitemMeta = kickitemStack.getItemMeta();
            kickitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "No Access")));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.RED + "You don't have access to this");
            kickitemMeta.setLore(lore4);
            kickitemStack.setItemMeta(kickitemMeta);
            inv.setItem(24, kickitemStack);
        }

        if (player.hasPermission(PermMessage.STAFF_BAN)) {
            // Staff Ban -- GUI
            ItemStack banitemStack = new ItemStack(Material.DIAMOND_AXE);
            ItemMeta banitemMeta = banitemStack.getItemMeta();
            banitemMeta.displayName(Component.text(ColourCode.colour("&6&l" + "Ban")));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.AQUA + "Click to see the staff bans");
            banitemMeta.setLore(lore4);
            banitemStack.setItemMeta(banitemMeta);
            inv.setItem(34, banitemStack);
        } else {
            // Staff Ban -- GUI
            ItemStack banitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta banitemMeta = banitemStack.getItemMeta();
            banitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "No Access")));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.RED + "You don't have access to this");
            banitemMeta.setLore(lore4);
            banitemStack.setItemMeta(banitemMeta);
            inv.setItem(34, banitemStack);
        }

        //Design//

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

        setStaffgui(inv);

    }

    public Inventory getStaffgui() {
        return staffgui;
    }

    public void setStaffgui(Inventory inv) {
        staffgui = inv;
    }

    public static void openStaffgui(Player player) {
        player.openInventory(staffgui);
    }

}
