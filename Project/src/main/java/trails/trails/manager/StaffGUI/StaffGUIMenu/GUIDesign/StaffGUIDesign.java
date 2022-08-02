package trails.trails.manager.StaffGUI.StaffGUIMenu.GUIDesign;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.Utils.ColourCode;

public class StaffGUIDesign {

    private static Inventory staffgui;

    public void registerDesign() {

        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ColourCode.colour("&b&l" + "  <<<===Staff===>>>")));

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

        setStaffdesign(inv);

    }

    public void setStaffdesign(Inventory inv) {
        staffgui = inv;
    }

}
