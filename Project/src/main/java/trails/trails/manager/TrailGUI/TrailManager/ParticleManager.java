package trails.trails.manager.TrailGUI.TrailManager;

import org.bukkit.Bukkit;

import java.util.HashMap;
import java.util.UUID;

public class ParticleManager {

    private static HashMap<UUID, Integer> TRAILPART = new HashMap<UUID, Integer>();

    private final UUID uuid;

    public ParticleManager(UUID uuid) {
        this.uuid = uuid;
    }

    public void setID(int id) {
        TRAILPART.put(uuid, id);
    }

    public int getID() {
        return TRAILPART.get(uuid);
    }

    public boolean hasID() {
        if (TRAILPART.containsKey(uuid))
            return true;
        return false;
    }

    public void removeID() {
        TRAILPART.remove(uuid);
    }

    public void endTask() {

        if (getID() == 1) return;

        Bukkit.getScheduler().cancelTask(getID());

    }

    public static boolean FakeID(UUID uuid) {
        if (TRAILPART.containsKey(uuid))
            if (TRAILPART.get(uuid) == 1)
                return true;
        return false;
    }

}
