package trails.trails;

import org.bukkit.plugin.java.JavaPlugin;
import trails.trails.command.AdminTest;
import trails.trails.command.Staff;
import trails.trails.command.Trail;
import trails.trails.manager.ArrayManagers.ArrayManager;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Ban.ConfirmBanEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Ban.StaffBanEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Fun.FreezeMenuEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Fun.StaffFreezeEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Kicks.ConfirmKickEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Kicks.StaffKickEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.List.StaffListEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Main.StaffGUIEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Unban.ConfirmUnbanEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Bans.Unban.StaffUnbanEvent;
import trails.trails.manager.StaffGUI.StaffGUIEvents.Management.ManagementGUIEvent;
import trails.trails.manager.StaffManage.StaffID;
import trails.trails.manager.TrailGUI.TrailGUIEvents.ClickEventFreeGUI;
import trails.trails.manager.TrailGUI.TrailGUIEvents.RankGUIEvents;
import trails.trails.manager.TrailGUI.TrailGUIEvents.ClickEventGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.FreePartGUI;
import trails.trails.manager.TrailGUI.TrailGUIMenu.TrailGUI;

public final class Trails extends JavaPlugin {

    private ArrayManager arrayManager;

    private TrailGUI trailGUI;

    @Override
    public void onEnable() {
        // Plugin startup logic

        //Trails
        //==//        //==//      //==//        //==//       //==//        //==//      //==//        //==//

        TrailGUI trailGUI = new TrailGUI();
        trailGUI.registerGUI();

        FreePartGUI freePartGUI = new FreePartGUI();
        freePartGUI.registerFreeGUI();

        getServer().getPluginManager().registerEvents(new ClickEventGUI(), this);

        getServer().getPluginManager().registerEvents(new ClickEventFreeGUI(), this);

        getServer().getPluginManager().registerEvents(new RankGUIEvents(), this);

        //Staff
        //==//        //==//      //==//        //==//       //==//        //==//      //==//        //==//

        //Main

        getServer().getPluginManager().registerEvents(new StaffGUIEvent(), this);

        //Freeze

        getServer().getPluginManager().registerEvents(new StaffFreezeEvent(), this);

        getServer().getPluginManager().registerEvents(new FreezeMenuEvent(), this);

        //List

        getServer().getPluginManager().registerEvents(new StaffListEvent(), this);

        //Kick

        getServer().getPluginManager().registerEvents(new StaffKickEvent(), this);

        //Ban

        getServer().getPluginManager().registerEvents(new StaffBanEvent(), this);

        getServer().getPluginManager().registerEvents(new ConfirmBanEvent(), this);

        //Unban

        getServer().getPluginManager().registerEvents(new StaffUnbanEvent(), this);

        getServer().getPluginManager().registerEvents(new ConfirmUnbanEvent(), this);

        //Kick

        getServer().getPluginManager().registerEvents(new StaffKickEvent(), this);

        getServer().getPluginManager().registerEvents(new ConfirmKickEvent(), this);

        //Management

        getServer().getPluginManager().registerEvents(new ManagementGUIEvent(), this);

        //StaffManage

        //StaffID

        getServer().getPluginManager().registerEvents(new StaffID(), this);



        //Commands
        //==//        //==//      //==//        //==//       //==//        //==//      //==//        //==//

        getCommand("trails").setExecutor(new Trail());
        getCommand("staff").setExecutor(new Staff());
        getCommand("admin").setExecutor(new AdminTest(arrayManager));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
