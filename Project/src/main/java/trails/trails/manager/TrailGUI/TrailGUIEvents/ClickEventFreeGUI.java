package trails.trails.manager.TrailGUI.TrailGUIEvents;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import trails.trails.manager.TrailGUI.TrailGUIMenu.FreePartGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.TrailGUI;
import trails.trails.manager.TrailGUI.TrailManager.ParticleManager;
import trails.trails.manager.TrailGUI.TrailManager.TrailEffects;

public class ClickEventFreeGUI implements Listener {

    private FreePartGUI gui;

    private ParticleManager particleManager;

    public ClickEventFreeGUI() {
        gui = new FreePartGUI();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(gui.getFreegui()))
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
                trailEffects.startNormal();
                player.closeInventory();
                player.updateInventory();
                player.sendMessage(ChatColor.GREEN + "Trail Active");
                break;
            case 14:
                trailEffects.startDeep();
                player.closeInventory();
                player.updateInventory();
                player.sendMessage(ChatColor.GREEN + "Trail Active");
                break;
                //Functions
            case 8:
                player.closeInventory();
                player.updateInventory();
                break;

                // Opens main GUI again
            case 0:
                player.updateInventory();
                TrailGUI.openTrailGUI(player);
                break;
        }

    }

}
