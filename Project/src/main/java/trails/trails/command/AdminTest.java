package trails.trails.command;

import net.kyori.adventure.text.ComponentLike;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import trails.trails.manager.ArrayManagers.ArrayManager;
import trails.trails.manager.ArrayManagers.StaffArray;

import java.util.HashMap;
import java.util.UUID;

public class AdminTest implements CommandExecutor {

    private ArrayManager arrayManager;

    public AdminTest(ArrayManager arrayManager) {
        this.arrayManager = arrayManager;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players in-game can use this command");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 1) {
            try {
                if (args[0].equalsIgnoreCase("enable")) {
                    ArrayManager.addPlayer(player.getUniqueId());
                    player.sendMessage(ChatColor.RED + player.getName() + " Has enabled admin commands");
                }

                if (args[0].equalsIgnoreCase("disable")) {
                    ArrayManager.removePlayer(player.getUniqueId());
                    player.sendMessage(ChatColor.RED + player.getName() + " Has disabled admin commands");
                }

                if (args[0].equalsIgnoreCase("wipe")) {
                    ArrayManager.removeAll();
                    player.sendMessage(ChatColor.AQUA + "All players have had their admin test commands revoked");
                }

                if (args[0].equalsIgnoreCase("test")) {
                    player.sendMessage(StaffArray.getStafflist().toString());
                    player.sendMessage("ID: " + StaffArray.getStafflist().values());
                }
            } catch (IllegalArgumentException e) {
                Bukkit.getServer().getLogger().warning("Error Message" + e);
            }
        } else if (args.length == 2) {
            try {
                Player target = Bukkit.getPlayerExact(args[0]);

                if (args[1].equalsIgnoreCase("add")) {
                    ArrayManager.addPlayer(target.getUniqueId());
                    player.sendMessage(target.getUniqueId() + " Has been allowed access to test commands");
                }

                if (args[1].equalsIgnoreCase("remove")) {
                    ArrayManager.removePlayer(target.getUniqueId());
                    player.sendMessage(target.getUniqueId() + " Access to test commands has ben revoked");
                }
            } catch (IllegalArgumentException e) {
                Bukkit.getServer().getLogger().warning("Error Message " + e);
            }
        } else {
            player.sendMessage(ChatColor.RED + "You didn't provide the correct arguments");
            player.sendMessage(ChatColor.RED + "/admin <enable/disable> or /admin <player> <enable/disable>");
        }



        return true;
    }
}
