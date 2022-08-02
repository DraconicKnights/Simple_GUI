package trails.trails.Utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ColourCode {

    public static @NotNull String colour(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public static void msgPlayer(Player player, String... strings) {
        for (String string : strings) {
            player.sendMessage(colour(string));
        }
    }

}
