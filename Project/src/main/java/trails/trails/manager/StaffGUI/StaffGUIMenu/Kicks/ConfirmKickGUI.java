package trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.Utils.ColourCode;

public class ConfirmKickGUI {

    private static Inventory confirmkickgui;

    public void RegisterConfirmKickgui(Player player, Player kicktarget) {

        Inventory inv = Bukkit.createInventory(null, 9, Component.text(ColourCode.colour("&b&l" + "  <<<===Kick Confirm===>>>")));

        ItemStack kick = new ItemStack(Material.EMERALD_BLOCK, 1);
        ItemMeta kickmeta = kick.getItemMeta();
        kickmeta.displayName(Component.text(ColourCode.colour("&a&l" + "Yes")));
        kick.setItemMeta(kickmeta);
        inv.setItem(2, kick);

        ItemStack playerban = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta playermeta = playerban.getItemMeta();
        playermeta.displayName(kicktarget.displayName());
        playerban.setItemMeta(playermeta);
        inv.setItem(4, playerban);

        ItemStack stop = new ItemStack(Material.REDSTONE_BLOCK, 1);
        ItemMeta stopmeta = stop.getItemMeta();
        stopmeta.displayName(Component.text(ColourCode.colour("&c&l" + "No")));
        stop.setItemMeta(stopmeta);
        inv.setItem(6, stop);

        setConfirmKickgui(inv);

    }

    public Inventory getConfirmKickgui() {
        return confirmkickgui;
    }

    public void setConfirmKickgui(Inventory inv) {
        confirmkickgui = inv;
    }

    public static void openConfirmKickgui(Player player) {
        player.openInventory(confirmkickgui);
    }

}
