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

public class FreezeGUIMenu {

    private static Inventory freezeguimenu;

    public void registerFreezeGUIMenu(Player player, Player target) {

        Inventory inv = Bukkit.createInventory(null, 9, Component.text(ColourCode.colour("&b&l" + "<<<===Freeze Player===>>>")));

        ItemStack ban = new ItemStack(Material.ICE, 1);
        ItemMeta banmeta = ban.getItemMeta();
        banmeta.displayName(Component.text(ColourCode.colour("&b&l" + "Freeze")));
        ban.setItemMeta(banmeta);
        inv.setItem(1, ban);

        ItemStack unfreeze = new ItemStack(Material.CAMPFIRE, 1);
        ItemMeta unfreezemeta = unfreeze.getItemMeta();
        unfreezemeta.displayName(Component.text(ColourCode.colour("&a&l" + "Unfreeze")));
        unfreeze.setItemMeta(unfreezemeta);
        inv.setItem(2, unfreeze);

        ItemStack playerban = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta playermeta = playerban.getItemMeta();
        playermeta.displayName(target.displayName());
        playerban.setItemMeta(playermeta);
        inv.setItem(4, playerban);

        ItemStack noban = new ItemStack(Material.REDSTONE_BLOCK, 1);
        ItemMeta nobanmeta = noban.getItemMeta();
        nobanmeta.displayName(Component.text(ColourCode.colour("&c&l" + "Back")));
        noban.setItemMeta(nobanmeta);
        inv.setItem(6, noban);

        setFreezeguimenu(inv);

    }

    public Inventory getFreezeguimenu() {
        return freezeguimenu;
    }

    public void setFreezeguimenu(Inventory inv) {
        freezeguimenu = inv;
    }

    public static void openFreezeguiMenu(Player player) {
        player.openInventory(freezeguimenu);
    }

}
