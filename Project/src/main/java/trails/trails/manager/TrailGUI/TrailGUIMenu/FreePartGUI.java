package trails.trails.manager.TrailGUI.TrailGUIMenu;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FreePartGUI {

    private static Inventory freegui;

    public void registerFreeGUI() {
        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ChatColor.LIGHT_PURPLE + "             " + "Normal Trails"));

        //Lava -- Normal Trail
        ItemStack normalitemStack = new ItemStack(Material.GRASS_BLOCK);
        ItemMeta normalitemMeta = normalitemStack.getItemMeta();
        normalitemMeta.displayName(Component.text(ChatColor.GREEN + "Normal Trail"));
        List<String> lore1 = new ArrayList<>();
        lore1.add("");
        lore1.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
        normalitemMeta.setLore(lore1);
        normalitemStack.setItemMeta(normalitemMeta);
        inv.setItem(12, normalitemStack);

        //Flint -- Depths of the Deep
        ItemStack deepitemStack = new ItemStack(Material.GUARDIAN_SPAWN_EGG);
        ItemMeta deepitemMeta = deepitemStack.getItemMeta();
        deepitemMeta.displayName(Component.text(ChatColor.AQUA + "Depths of the Deep"));
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
        deepitemMeta.setLore(lore);
        deepitemStack.setItemMeta(deepitemMeta);
        inv.setItem(14, deepitemStack);

        //Flint -- Flames of Wrath
        ItemStack flamesitemStack = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta flamesitemMeta = flamesitemStack.getItemMeta();
        flamesitemMeta.displayName(Component.text(ChatColor.GOLD + "Flames of Wrath"));
        List<String> lore2 = new ArrayList<>();
        lore2.add("");
        lore2.add(ChatColor.LIGHT_PURPLE + "Click to enable trail");
        flamesitemMeta.setLore(lore2);
        flamesitemStack.setItemMeta(flamesitemMeta);
        inv.setItem(40, flamesitemStack);

        //Functions

        //Close -- Closes the Trails GUI
        ItemStack closeitemStack = new ItemStack(Material.IRON_DOOR);
        ItemMeta closeitemMeta = closeitemStack.getItemMeta();
        closeitemMeta.displayName(Component.text(ChatColor.RED + "Close Trails"));
        List<String> lore3 = new ArrayList<>();
        lore3.add("");
        lore3.add(ChatColor.RED + "Click to close menu");
        closeitemMeta.setLore(lore3);
        closeitemStack.setItemMeta(closeitemMeta);
        inv.setItem(8, closeitemStack);

        //GUI -- Return GUI
        ItemStack returnGUIitemStack = new ItemStack(Material.CHEST);
        ItemMeta returnGUIitemMeta = returnGUIitemStack.getItemMeta();
        returnGUIitemMeta.displayName(Component.text(ChatColor.RED + "Back"));
        List<String> lore4 = new ArrayList<>();
        lore4.add("");
        lore4.add(ChatColor.AQUA + "Click to go back to the main page");
        returnGUIitemMeta.setLore(lore4);
        returnGUIitemStack.setItemMeta(returnGUIitemMeta);
        inv.setItem(0, returnGUIitemStack);

        setFreegui(inv);

    }

    public Inventory getFreegui() {
        return freegui;
    }

    private void setFreegui(Inventory inv) {
        freegui = inv;
    }

    public static void openFreeGUI(Player player) {
        player.openInventory(freegui);
    }

}
