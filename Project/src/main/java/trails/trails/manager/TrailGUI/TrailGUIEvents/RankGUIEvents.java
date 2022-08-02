package trails.trails.manager.TrailGUI.TrailGUIEvents;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import trails.trails.manager.TrailGUI.TrailGUIMenu.RankGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.TrailGUI;
import trails.trails.manager.TrailGUI.TrailManager.ParticleManager;
import trails.trails.manager.TrailGUI.TrailManager.TrailEffects;
import trails.trails.messages.PlayerMessage;

public class RankGUIEvents implements Listener {

    private RankGUI gui;

    private ParticleManager particleManager;

    public RankGUIEvents() {
        gui = new RankGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getRankTrailgui()))
            return;

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (event.getView().getType() == InventoryType.PLAYER)
            return;

        ParticleManager playerparticle = new ParticleManager(player.getUniqueId());

        if (playerparticle.hasID()) {
            playerparticle.endTask();
            playerparticle.removeID();
        }

        TrailEffects trailEffects = new TrailEffects(player);

        switch (event.getSlot()) {
            case 12:
                if (player.hasPermission("trails.flame")) {
                    trailEffects.startFire();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            case 14:
                if (player.hasPermission("trails.water")) {
                    trailEffects.startWater();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            case 20:
                if (player.hasPermission("trails.fire")) {
                    trailEffects.startLava();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            case 24:
                if (player.hasPermission("trails.snow")) {
                    trailEffects.startSnow();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            case 32:
                if (player.hasPermission("trails.wild")) {
                    trailEffects.startNature();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            case 30:
                if (player.hasPermission("trails.mage")) {
                    trailEffects.startMagic();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            case 40:
                if (player.hasPermission("trails.dragon")) {
                    trailEffects.startDragon();
                    player.closeInventory();
                    player.updateInventory();
                    player.sendMessage(ChatColor.GREEN + "Trail Active");
                } else {
                    player.sendMessage(ChatColor.RED + PlayerMessage.PLAYER_LACKS_PERMISSIONS);
                }
                break;
            //Functions
            case 49:
                trailEffects.startClear();
                player.closeInventory();
                player.updateInventory();
                player.sendMessage(ChatColor.RED + "Trail Removed");
                break;
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;
            case 0:
                player.updateInventory();
                TrailGUI.openTrailGUI(player);
                break;
        }
    }
}
