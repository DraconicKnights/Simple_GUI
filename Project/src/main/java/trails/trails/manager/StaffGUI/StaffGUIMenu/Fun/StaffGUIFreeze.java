package trails.trails.manager.StaffGUI.StaffGUIMenu.Fun;

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

public class StaffGUIFreeze extends StaffGUIDesign {

    private static Inventory staffgui;

    public void registerStaffListGUI(Player player) {

        ArrayList<Player> onlineplayerlist = new ArrayList<>(player.getServer().getOnlinePlayers());

        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ColourCode.colour("&b&l" + "  <<<===Freeze Menu===>>>")));

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

        //Freeze -- Nothing
        ItemStack staritemStack = new ItemStack(Material.BLAZE_ROD);
        ItemMeta staritemMeta = staritemStack.getItemMeta();
        staritemMeta.displayName(Component.text(ColourCode.colour("&d&l" + "Freeze")));
        List<String> lorestar = new ArrayList<>();
        lorestar.add("");
        lorestar.add(ChatColor.AQUA + "");
        staritemMeta.setLore(lorestar);
        staritemStack.setItemMeta(staritemMeta);
        inv.setItem(4, staritemStack);

        // Glass Pane -- Nothing
        ItemStack paneitemStack = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta paneitemMeta = paneitemStack.getItemMeta();
        paneitemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        paneitemStack.setItemMeta(paneitemMeta);
        inv.setItem(1, paneitemStack);

        // Glass Pane -- Nothing
        ItemStack pane1itemStack = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta pane1itemMeta = pane1itemStack.getItemMeta();
        pane1itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane1itemStack.setItemMeta(pane1itemMeta);
        inv.setItem(2, pane1itemStack);

        // Glass Pane -- Nothing
        ItemStack pane2itemStack = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta pane2itemMeta = pane2itemStack.getItemMeta();
        pane2itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane2itemStack.setItemMeta(pane2itemMeta);
        inv.setItem(3, pane2itemStack);

        // Glass Pane -- Nothing
        ItemStack pane3itemStack = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta pane3itemMeta = pane3itemStack.getItemMeta();
        pane3itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane3itemStack.setItemMeta(pane3itemMeta);
        inv.setItem(5, pane3itemStack);

        // Glass Pane -- Nothing
        ItemStack pane4itemStack = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta pane4itemMeta = pane4itemStack.getItemMeta();
        pane4itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane4itemStack.setItemMeta(pane4itemMeta);
        inv.setItem(6, pane4itemStack);

        // Glass Pane -- Nothing
        ItemStack pane5itemStack = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta pane5itemMeta = pane5itemStack.getItemMeta();
        pane5itemMeta.displayName(Component.text(ChatColor.GOLD + ""));
        pane5itemStack.setItemMeta(pane5itemMeta);
        inv.setItem(7, pane5itemStack);

        for (int i = 0; i < onlineplayerlist.size(); i++) {

            if (onlineplayerlist.get(i).hasPermission(PermMessage.STAFF)) {

                ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
                ItemMeta playerMeta = playerHead.getItemMeta();

                playerMeta.displayName(onlineplayerlist.get(i).displayName());
                ArrayList lore = new ArrayList<>();
                lore.add(ChatColor.GOLD + "World: " + ChatColor.AQUA + onlineplayerlist.get(i).getWorld().getName());
                if (player.hasPermission("staff.management")) {
                    lore.add(ChatColor.GOLD + "UUID: " + ChatColor.AQUA + onlineplayerlist.get(i).getUniqueId());
                    lore.add(ChatColor.GOLD + "Gamemode: " + ChatColor.AQUA + onlineplayerlist.get(i).getGameMode());
                    lore.add(ChatColor.GOLD + "Staff: " + ChatColor.GREEN + "Yes");
                }
                playerMeta.setLore(lore);
                playerHead.setItemMeta(playerMeta);
                inv.addItem(playerHead);
            } else {
                ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
                ItemMeta playerMeta = playerHead.getItemMeta();

                playerMeta.displayName(onlineplayerlist.get(i).displayName());
                ArrayList lore = new ArrayList<>();
                lore.add(ChatColor.GOLD + "World: " + ChatColor.AQUA + onlineplayerlist.get(i).getWorld().getName());
                if (player.hasPermission("staff.management")) {
                    lore.add(ChatColor.GOLD + "UUID: " + ChatColor.AQUA + onlineplayerlist.get(i).getUniqueId());
                    lore.add(ChatColor.GOLD + "Gamemode: " + ChatColor.AQUA + onlineplayerlist.get(i).getGameMode());
                    lore.add(ChatColor.GOLD + "Staff: " + ChatColor.RED + "No");
                }
                playerMeta.setLore(lore);
                playerHead.setItemMeta(playerMeta);
                inv.addItem(playerHead);
            }

        }

        setStaffFreezegui(inv);

    }

    public Inventory getStaffFreezegui() {
        return staffgui;
    }

    public void setStaffFreezegui(Inventory inv) {
        staffgui = inv;
    }

    public static void openStaffFreezegui(Player player) {
        player.openInventory(staffgui);
    }

}
