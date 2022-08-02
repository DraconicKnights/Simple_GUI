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

public class TrailGUI {

    private static Inventory trailgui;

    private ClickEventGUI clickEventGUI;

    public void registerGUI() {
        Inventory inv = Bukkit.createInventory(null, 54, Component.text(ChatColor.LIGHT_PURPLE + "             " + "Trails Menu"));

        //Functions

        //Clear -- Clears all Particles
        ItemStack clearitemStack = new ItemStack(Material.BARRIER);
        ItemMeta clearitemMeta = clearitemStack.getItemMeta();
        clearitemMeta.displayName(Component.text(ChatColor.RED + "Remove Particles"));
        List<String> lore1 = new ArrayList<>();
        lore1.add("");
        lore1.add(ChatColor.RED + "Click to remove all trails");
        clearitemMeta.setLore(lore1);
        clearitemStack.setItemMeta(clearitemMeta);
        inv.setItem(49, clearitemStack);

        //Close -- Closes the Trails GUI
        ItemStack closeitemStack = new ItemStack(Material.IRON_DOOR);
        ItemMeta closeitemMeta = closeitemStack.getItemMeta();
        closeitemMeta.displayName(Component.text(ChatColor.RED + "Close Trails"));
        List<String> lore2 = new ArrayList<>();
        lore2.add("");
        lore2.add(ChatColor.RED + "Click to close the menu");
        closeitemMeta.setLore(lore2);
        closeitemStack.setItemMeta(closeitemMeta);
        inv.setItem(8, closeitemStack);

        // Free particle list -- GUI
        ItemStack guiitemStack = new ItemStack(Material.CHEST);
        ItemMeta guiitemMeta = guiitemStack.getItemMeta();
        guiitemMeta.displayName(Component.text(ChatColor.GOLD + "Normal Trails"));
        List<String> lore3 = new ArrayList<>();
        lore3.add("");
        lore3.add(ChatColor.AQUA + "Click to go to normal Trails");
        guiitemMeta.setLore(lore3);
        guiitemStack.setItemMeta(guiitemMeta);
        inv.setItem(12, guiitemStack);

        // Rank particle list -- GUI
        ItemStack rankitemStack = new ItemStack(Material.CHEST);
        ItemMeta rankitemMeta = rankitemStack.getItemMeta();
        rankitemMeta.displayName(Component.text(ChatColor.GOLD + "Rank Trails"));
        List<String> lore4 = new ArrayList<>();
        lore4.add("");
        lore4.add(ChatColor.AQUA + "Click to go to rank Trails");
        rankitemMeta.setLore(lore4);
        rankitemStack.setItemMeta(rankitemMeta);
        inv.setItem(14, rankitemStack);

        setTrailgui(inv);
    }

    public Inventory getTrailgui() {
        return trailgui;
    }

    private void setTrailgui(Inventory inv) {
        trailgui = inv;
    }

    public static void openTrailGUI(Player player) {
        player.openInventory(trailgui);
    }

}
