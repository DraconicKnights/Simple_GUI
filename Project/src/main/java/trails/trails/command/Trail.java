package trails.trails.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import trails.trails.manager.ArrayManagers.ArrayManager;
import trails.trails.manager.TrailGUI.TrailGUIMenu.TrailGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.RankGUI;

public class Trail implements CommandExecutor {

    private ArrayManager arrayManager;

    private TrailGUI trailGUI;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players in-game can use this comamnd");
            return true;
        }

        Player player = (Player) sender;

        RankGUI rankEventGUI = new RankGUI();
        rankEventGUI.registerRankGUI(player);


        if (ArrayManager.getPlayerlist().contains(player.getUniqueId())) {
//            TrailGUI trailMenu = new TrailGUI();
//            trailMenu.openTrailGUI(player);
            TrailGUI.openTrailGUI(player);
            return true;
        } else {
            player.sendMessage(ChatColor.RED + "You don't have access to this command");
        }


        return true;
    }
}
