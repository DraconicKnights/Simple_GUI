package trails.trails.manager.StaffManage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import trails.trails.manager.ArrayManagers.StaffArray;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;

import java.util.Random;

public class StaffID implements Listener {

    public static int ID;

    @EventHandler
    public void StaffJoin(PlayerJoinEvent event) {
        Player player = (Player) event.getPlayer();

        ID = IDGen();

        if (!player.hasPermission(PermMessage.STAFF))
            return;
        StaffArray.addUser(player.getUniqueId(), ID);

    }

    @EventHandler
    public void StaffLeave(PlayerQuitEvent event) {
        Player player = (Player) event.getPlayer();

        if (!StaffArray.getStafflist().containsKey(player.getUniqueId()))
            return;
        StaffArray.removeUser(player.getUniqueId(), ID);
    }

    public static int IDGen() {
        Random number = new Random();

        for (int counter = 1; counter <= 1; counter++) {
            ID = number.nextInt(50);
        }
        return ID;
    }

}
