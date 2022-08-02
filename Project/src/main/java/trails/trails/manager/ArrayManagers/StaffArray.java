package trails.trails.manager.ArrayManagers;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;


public class StaffArray implements Listener {

    private static HashMap<UUID, Integer> stafflist = new HashMap<>();

    public static HashMap<UUID, Integer> getStafflist() {
        return stafflist;
    }

    public static void addUser(UUID uuid, Integer id) {
        stafflist.put(uuid, id);
    }

    public static void removeUser(UUID uuid, Integer id) {
        stafflist.remove(uuid, id);
    }
}
