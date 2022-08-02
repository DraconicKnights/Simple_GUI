package trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban;

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
import trails.trails.manager.StaffGUI.StaffGUIMenu.GUIDesign.StaffGUIDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class StaffUnbanGUI extends StaffGUIDesign {

    private static Inventory staffgui;

    public void registerStaffUnbanGUI(Player player) {

        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ColourCode.colour("&b&l" + "  <<<===Staff Unban===>>>")));

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
        lore3.add(ChatColor.RED + "Click to return");
        guiitemMeta.setLore(lore3);
        guiitemStack.setItemMeta(guiitemMeta);
        inv.setItem(0, guiitemStack);

        //Design//

        //Unban -- Nothing
        ItemStack staritemStack = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta staritemMeta = staritemStack.getItemMeta();
        staritemMeta.displayName(Component.text(ColourCode.colour("&d&l" + "Unban")));
        List<String> lorestar = new ArrayList<>();
        lorestar.add("");
        lorestar.add(ChatColor.AQUA + "");
        staritemMeta.setLore(lorestar);
        staritemStack.setItemMeta(staritemMeta);
        inv.setItem(4, staritemStack);

        // Glass Pane -- Nothing
        ItemStack paneitemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta paneitemMeta = paneitemStack.getItemMeta();
        paneitemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        paneitemStack.setItemMeta(paneitemMeta);
        inv.setItem(1, paneitemStack);

        // Glass Pane -- Nothing
        ItemStack pane1itemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta pane1itemMeta = pane1itemStack.getItemMeta();
        pane1itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane1itemStack.setItemMeta(pane1itemMeta);
        inv.setItem(2, pane1itemStack);

        // Glass Pane -- Nothing
        ItemStack pane2itemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta pane2itemMeta = pane2itemStack.getItemMeta();
        pane2itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane2itemStack.setItemMeta(pane2itemMeta);
        inv.setItem(3, pane2itemStack);

        // Glass Pane -- Nothing
        ItemStack pane3itemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta pane3itemMeta = pane3itemStack.getItemMeta();
        pane3itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane3itemStack.setItemMeta(pane3itemMeta);
        inv.setItem(5, pane3itemStack);

        // Glass Pane -- Nothing
        ItemStack pane4itemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta pane4itemMeta = pane4itemStack.getItemMeta();
        pane4itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane4itemStack.setItemMeta(pane4itemMeta);
        inv.setItem(6, pane4itemStack);

        // Glass Pane -- Nothing
        ItemStack pane5itemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta pane5itemMeta = pane5itemStack.getItemMeta();
        pane5itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane5itemStack.setItemMeta(pane5itemMeta);
        inv.setItem(7, pane5itemStack);

//        //Ban Function
//        for (int i = 0; i < StaffArray.getBanlist().size(); i++) {
//            ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
//            ItemMeta playerMeta = playerHead.getItemMeta();
//
//            playerMeta.displayName(StaffArray.getBanlist().get(i).displayName());
//            ArrayList lore = new ArrayList<>();
//            lore.add(ChatColor.GOLD + "World: " + ChatColor.AQUA + StaffArray.getBanlist().get(i).getWorld().getName());
//            if (player.hasPermission("staff.management")) {
//                lore.add(ChatColor.GOLD + "UUID: " + ChatColor.AQUA + StaffArray.getBanlist().get(i).getUniqueId());
//                lore.add(ChatColor.GOLD + "Gamemode: " + ChatColor.AQUA + StaffArray.getBanlist().get(i).getGameMode());
//            }
//            playerMeta.setLore(lore);
//            playerHead.setItemMeta(playerMeta);
//            inv.addItem(playerHead);
//
//        }

        setStaffUnbangui(inv);

    }

    public Inventory getStaffUnbangui() {
        return staffgui;
    }

    public void setStaffUnbangui(Inventory inv) {
        staffgui = inv;
    }

    public static void openStaffUnbangui(Player player) {
        player.openInventory(staffgui);
    }

}
