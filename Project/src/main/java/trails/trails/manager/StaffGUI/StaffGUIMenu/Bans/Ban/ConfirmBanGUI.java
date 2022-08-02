package trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import trails.trails.Utils.ColourCode;

public class ConfirmBanGUI {

    private static Inventory confirmbangui;

    public void registerConfirmBanGUI(Player player,Player bantarget) {

        Inventory inv = Bukkit.createInventory(null, 9, Component.text(ColourCode.colour("&b&l" + "  <<<===Ban Confirm===>>>")));

        ItemStack ban = new ItemStack(Material.EMERALD_BLOCK, 1);
        ItemMeta banmeta = ban.getItemMeta();
        banmeta.displayName(Component.text(ColourCode.colour("&a&l" + "Yes")));
        ban.setItemMeta(banmeta);
        inv.setItem(2, ban);

        ItemStack playerban = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta playermeta = playerban.getItemMeta();
        playermeta.displayName(bantarget.displayName());
        playerban.setItemMeta(playermeta);
        inv.setItem(4, playerban);

        ItemStack noban = new ItemStack(Material.REDSTONE_BLOCK, 1);
        ItemMeta nobanmeta = noban.getItemMeta();
        nobanmeta.displayName(Component.text(ColourCode.colour("&c&l" + "No")));
        noban.setItemMeta(nobanmeta);
        inv.setItem(6, noban);

        setConfirmBangui(inv);

    }

    public Inventory getConfirmBangui() {
        return confirmbangui;
    }

    public void setConfirmBangui(Inventory inv) {
        confirmbangui = inv;
    }

    public static void openConfirmBangui(Player player) {
        player.openInventory(confirmbangui);
    }

}
