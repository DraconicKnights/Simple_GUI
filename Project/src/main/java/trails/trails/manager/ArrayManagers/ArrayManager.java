package trails.trails.manager.ArrayManagers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ArrayManager {

    private static List<UUID> playerlist = new ArrayList<>();

    public static List<UUID> getPlayerlist() {
        return playerlist;
    }

    public static void addPlayer(UUID uuid) {
        playerlist.add(uuid);
    }

    public static void removePlayer(UUID uuid) {
        playerlist.remove(uuid);
    }

    public static void removeAll() {
        playerlist.removeAll(playerlist);
    }

}
