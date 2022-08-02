package trails.trails.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import trails.trails.manager.StaffGUI.PermissionMessages.PermMessage;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Ban.StaffGUIBan;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Bans.Unban.StaffUnbanGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Fun.StaffGUIFreeze;
import trails.trails.manager.StaffGUI.StaffGUIMenu.GUIDesign.StaffGUIDesign;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Kicks.StaffGUIKick;
import trails.trails.manager.StaffGUI.StaffGUIMenu.List.StaffGUIList;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Main.StaffGUI;
import trails.trails.manager.StaffGUI.StaffGUIMenu.Management.StaffManagementGUI;

public class Staff implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command");
            return true;
        }

        Player player = (Player) sender;

        StaffGUI staffGUI = new StaffGUI();
        staffGUI.registerGUI(player);

        StaffGUIList staffGUIList = new StaffGUIList();
        staffGUIList.registerStaffListGUI(player);

        StaffGUIFreeze staffGUIFreeze = new StaffGUIFreeze();
        staffGUIFreeze.registerStaffListGUI(player);

        StaffGUIKick staffGUIKick = new StaffGUIKick();
        staffGUIKick.registerStaffKickGUI(player);

        StaffGUIBan staffGUIBan = new StaffGUIBan();
        staffGUIBan.registerStaffBanGUI(player);

        StaffUnbanGUI staffUnbanGUI = new StaffUnbanGUI();
        staffUnbanGUI.registerStaffUnbanGUI(player);

        StaffManagementGUI staffManagementGUI = new StaffManagementGUI();
        staffManagementGUI.registerManageGUI(player);

        StaffGUIDesign staffGUIDesign = new StaffGUIDesign();
        staffGUIDesign.registerDesign();

        if (player.hasPermission(PermMessage.STAFF_MENU_PERM)) {
            StaffGUI.openStaffgui(player);
            return true;
        } else {
            player.sendMessage(ChatColor.RED + "You don't have access to this command");
        }


        return true;
    }
}
