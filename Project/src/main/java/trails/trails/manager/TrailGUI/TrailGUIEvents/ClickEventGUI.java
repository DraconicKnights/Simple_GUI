package trails.trails.manager.TrailGUI.TrailGUIEvents;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import trails.trails.manager.TrailGUI.TrailGUIMenu.FreePartGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.RankGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.TrailGUI;
import trails.trails.manager.TrailGUI.TrailManager.ParticleManager;
import trails.trails.manager.TrailGUI.TrailManager.TrailEffects;

public class ClickEventGUI implements Listener {

    private TrailGUI gui;

    private ParticleManager particleManager;

    public ClickEventGUI() {
        gui = new TrailGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getTrailgui()))
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
                // Opens Free GUI
            case 12:
                FreePartGUI.openFreeGUI(player);
                player.updateInventory();
                break;
            case 14:
                RankGUI.openRankTrailGUI(player);
                player.updateInventory();
                break;
        }
    }


}
