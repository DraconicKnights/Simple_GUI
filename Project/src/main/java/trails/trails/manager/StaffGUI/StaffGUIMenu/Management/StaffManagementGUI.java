package trails.trails.manager.StaffGUI.StaffGUIMenu.Management;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.Utils.ColourCode;

import java.util.ArrayList;
import java.util.List;

public class StaffManagementGUI {

    private static Inventory managegui;

    public void registerManageGUI(Player player) {

        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ColourCode.colour("&b&l" + "  <<<===Management===>>>")));

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
        List<String> lore3 = new ArrayList<>();
        lore3.add("");
        lore3.add(ChatColor.RED + "Click to return to main menu");
        guiitemMeta.setLore(lore3);
        guiitemStack.setItemMeta(guiitemMeta);
        inv.setItem(0, guiitemStack);

        //Report -- Staff Reports
        ItemStack reportitemStack = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta reportitemMeta = reportitemStack.getItemMeta();
        reportitemMeta.displayName(Component.text(ColourCode.colour("&c&l" + "Work in Progress")));
        List<String> loresreport = new ArrayList<>();
        loresreport.add("");
        loresreport.add(ChatColor.RED + "Work in Progress");
        reportitemMeta.setLore(loresreport);
        reportitemStack.setItemMeta(reportitemMeta);
        inv.setItem(14, reportitemStack);

        // Staff List -- GUI
        ItemStack listitemStack = new ItemStack(Material.COMPASS);
        ItemMeta listitemMeta = listitemStack.getItemMeta();
        listitemMeta.displayName(Component.text(ColourCode.colour("&6&l" + "Staff List")));
        List<String> lorelist = new ArrayList<>();
        lorelist.add("");
        lorelist.add(ChatColor.AQUA + "Click to see all staff online");
        listitemMeta.setLore(lorelist);
        listitemStack.setItemMeta(listitemMeta);
        inv.setItem(12, listitemStack);

        //Design//

        //Star -- Management/Staff View
        ItemStack staritemStack = new ItemStack(Material.NETHER_STAR);
        ItemMeta staritemMeta = staritemStack.getItemMeta();
        staritemMeta.displayName(Component.text(ColourCode.colour("&d&l" + "Management")));
        List<String> lorestar = new ArrayList<>();
        lorestar.add("");
        lorestar.add(ChatColor.AQUA + "");
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

        setManagegui(inv);

    }

    public Inventory getManagegui() {
        return managegui;
    }

    public void setManagegui(Inventory inv) {
        managegui = inv;
    }

    public static void openManagegui(Player player) {
        player.openInventory(managegui);
    }



}
