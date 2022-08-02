package trails.trails.manager.TrailGUI.TrailGUIMenu;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.manager.TrailGUI.TrailGUIEvents.ClickEventGUI;

import java.util.ArrayList;
import java.util.List;

public class RankGUI {

    private static Inventory rankgui;

    private ClickEventGUI clickEventGUI;

    public void registerRankGUI(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ChatColor.LIGHT_PURPLE + "             " + "Rank Trails"));

        if (player.hasPermission("trails.fire")) {
            //Lava -- Depths of Fire
            ItemStack lavaitemStack = new ItemStack(Material.WITHER_SKELETON_SKULL);
            ItemMeta lavaitemMeta = lavaitemStack.getItemMeta();
            lavaitemMeta.displayName(Component.text(ChatColor.RED + "Depths of Fire"));
            List<String> lore = new ArrayList<>();
            lore.add("");
            lore.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            lavaitemMeta.setLore(lore);
            lavaitemStack.setItemMeta(lavaitemMeta);
            inv.setItem(20, lavaitemStack);

        } else {
            //Lava -- Depths of Fire
            ItemStack lavaitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta lavaitemMeta = lavaitemStack.getItemMeta();
            lavaitemMeta.displayName(Component.text(ChatColor.RED + "Locked"));
            List<String> lore = new ArrayList<>();
            lore.add("");
            lore.add(ChatColor.RED + "You don't have access to this trail");
            lavaitemMeta.setLore(lore);
            lavaitemStack.setItemMeta(lavaitemMeta);
            inv.setItem(20, lavaitemStack);
        }

        if (player.hasPermission("trails.flame")) {
            //Flint -- Flames of Retribution
            ItemStack fireitemStack = new ItemStack(Material.FLINT_AND_STEEL);
            ItemMeta fireitemMeta = fireitemStack.getItemMeta();
            fireitemMeta.displayName(Component.text(ChatColor.GOLD + "Flames of Retribution"));
            List<String> lore1 = new ArrayList<>();
            lore1.add("");
            lore1.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            fireitemMeta.setLore(lore1);
            fireitemStack.setItemMeta(fireitemMeta);
            inv.setItem(12, fireitemStack);

        } else {
            //Flint -- Flames of Retribution
            ItemStack fireitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta fireitemMeta = fireitemStack.getItemMeta();
            fireitemMeta.displayName(Component.text(ChatColor.RED + "Locked"));
            List<String> lore1 = new ArrayList<>();
            lore1.add("");
            lore1.add(ChatColor.RED + "You don't have access to this trail");
            fireitemMeta.setLore(lore1);
            fireitemStack.setItemMeta(fireitemMeta);
            inv.setItem(12, fireitemStack);
        }

        if (player.hasPermission("trails.water")) {
            //Water -- Water of mending
            ItemStack wateritemStack = new ItemStack(Material.WATER_BUCKET);
            ItemMeta wateritemMeta = wateritemStack.getItemMeta();
            wateritemMeta.displayName(Component.text(ChatColor.DARK_BLUE + "Water of Mending"));
            List<String> lore2 = new ArrayList<>();
            lore2.add("");
            lore2.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            wateritemMeta.setLore(lore2);
            wateritemStack.setItemMeta(wateritemMeta);
            inv.setItem(14, wateritemStack);
        } else {
            //Water -- Water of mending
            ItemStack wateritemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta wateritemMeta = wateritemStack.getItemMeta();
            wateritemMeta.displayName(Component.text(ChatColor.RED + "Locked"));
            List<String> lore2 = new ArrayList<>();
            lore2.add("");
            lore2.add(ChatColor.RED + "You don't have access to this trail");
            wateritemMeta.setLore(lore2);
            wateritemStack.setItemMeta(wateritemMeta);
            inv.setItem(14, wateritemStack);
        }

        if (player.hasPermission("trails.snow")) {
            //Water -- Water of mending
            ItemStack snowitemStack = new ItemStack(Material.CARVED_PUMPKIN);
            ItemMeta snowitemMeta = snowitemStack.getItemMeta();
            snowitemMeta.displayName(Component.text(ChatColor.BLUE + "Tundra of the North"));
            List<String> lore3 = new ArrayList<>();
            lore3.add("");
            lore3.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            snowitemMeta.setLore(lore3);
            snowitemStack.setItemMeta(snowitemMeta);
            inv.setItem(24, snowitemStack);
        } else {
            //Water -- Water of mending
            ItemStack snowitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta snowitemMeta = snowitemStack.getItemMeta();
            snowitemMeta.displayName(Component.text(ChatColor.BLUE + "Locked"));
            List<String> lore3 = new ArrayList<>();
            lore3.add("");
            lore3.add(ChatColor.RED + "You don't have access to this trail");
            snowitemMeta.setLore(lore3);
            snowitemStack.setItemMeta(snowitemMeta);
            inv.setItem(24, snowitemStack);
        }

        if (player.hasPermission("trails.wild")) {
            //Wild -- Wildlife Rose
            ItemStack natureitemStack = new ItemStack(Material.DARK_OAK_LEAVES);
            ItemMeta natureitemMeta = natureitemStack.getItemMeta();
            natureitemMeta.displayName(Component.text(ChatColor.GREEN + "Wildlife Rose"));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            natureitemMeta.setLore(lore4);
            natureitemStack.setItemMeta(natureitemMeta);
            inv.setItem(32, natureitemStack);
        } else {
            //Wild -- Wildlife Rose
            ItemStack natureitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta natureitemMeta = natureitemStack.getItemMeta();
            natureitemMeta.displayName(Component.text(ChatColor.RED + "Locked"));
            List<String> lore4 = new ArrayList<>();
            lore4.add("");
            lore4.add(ChatColor.RED + "You don't have access to this trail");
            natureitemMeta.setLore(lore4);
            natureitemStack.setItemMeta(natureitemMeta);
            inv.setItem(32, natureitemStack);
        }


        if (player.hasPermission("trails.mage")) {
            //Mage -- Mage of the East
            ItemStack magicitemStack = new ItemStack(Material.ENCHANTED_BOOK);
            ItemMeta magicitemMeta = magicitemStack.getItemMeta();
            magicitemMeta.displayName(Component.text(ChatColor.YELLOW + "Mage of the East"));
            List<String> lore5 = new ArrayList<>();
            lore5.add("");
            lore5.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            magicitemMeta.setLore(lore5);
            magicitemStack.setItemMeta(magicitemMeta);
            inv.setItem(30, magicitemStack);
        } else {
            //Mage -- Mage of the East
            ItemStack magicitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta magicitemMeta = magicitemStack.getItemMeta();
            magicitemMeta.displayName(Component.text(ChatColor.RED + "Locked"));
            List<String> lore5 = new ArrayList<>();
            lore5.add("");
            lore5.add(ChatColor.RED + "You don't have access to this trail");
            magicitemMeta.setLore(lore5);
            magicitemStack.setItemMeta(magicitemMeta);
            inv.setItem(30, magicitemStack);
        }

        if (player.hasPermission("trails.dragon")) {
            //Dragon -- Dragon's Breath
            ItemStack dragonitemStack = new ItemStack(Material.DRAGON_EGG);
            ItemMeta dragonitemMeta = dragonitemStack.getItemMeta();
            dragonitemMeta.displayName(Component.text(ChatColor.DARK_PURPLE + "Dragon's Breath"));
            List<String> lore6 = new ArrayList<>();
            lore6.add("");
            lore6.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
            dragonitemMeta.setLore(lore6);
            dragonitemStack.setItemMeta(dragonitemMeta);
            inv.setItem(40, dragonitemStack);
        } else {
            //Dragon -- Dragon's Breath
            ItemStack dragonitemStack = new ItemStack(Material.GRAY_DYE);
            ItemMeta dragonitemMeta = dragonitemStack.getItemMeta();
            dragonitemMeta.displayName(Component.text(ChatColor.RED + "Locked"));
            List<String> lore6 = new ArrayList<>();
            lore6.add("");
            lore6.add(ChatColor.RED + "You don't have access to this trail");
            dragonitemMeta.setLore(lore6);
            dragonitemStack.setItemMeta(dragonitemMeta);
            inv.setItem(40, dragonitemStack);
        }

        //Functions

        //Close -- Closes the Trails GUI
        ItemStack closeitemStack = new ItemStack(Material.IRON_DOOR);
        ItemMeta closeitemMeta = closeitemStack.getItemMeta();
        closeitemMeta.displayName(Component.text(ChatColor.RED + "Close Trails"));
        List<String> lore8 = new ArrayList<>();
        lore8.add("");
        lore8.add(ChatColor.RED + "Click to close the menu");
        closeitemMeta.setLore(lore8);
        closeitemStack.setItemMeta(closeitemMeta);
        inv.setItem(8, closeitemStack);

        // Return -- GUI
        ItemStack guiitemStack = new ItemStack(Material.CHEST);
        ItemMeta guiitemMeta = guiitemStack.getItemMeta();
        guiitemMeta.displayName(Component.text(ChatColor.RED + "Back"));
        List<String> lore9 = new ArrayList<>();
        lore9.add("");
        lore9.add(ChatColor.RED + "Click to return to main menu");
        guiitemMeta.setLore(lore9);
        guiitemStack.setItemMeta(guiitemMeta);
        inv.setItem(0, guiitemStack);

        setRankTrailgui(inv);
    }

    public Inventory getRankTrailgui() {
        return rankgui;
    }

    private void setRankTrailgui(Inventory inv) {
        rankgui = inv;
    }

    public static void openRankTrailGUI(Player player) {
        player.openInventory(rankgui);
    }

}
