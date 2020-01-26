package com.hackerman.plugin;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.commands.CommandHandler;
import com.eu.habbo.habbohotel.users.Habbo;
import com.eu.habbo.plugin.EventHandler;
import com.eu.habbo.plugin.EventListener;
import com.eu.habbo.plugin.HabboPlugin;
import com.eu.habbo.plugin.events.emulator.EmulatorLoadedEvent;
import com.hackerman.plugin.commands.commandCommands;
import com.hackerman.plugin.hhcore.checkIntegrity;

import java.io.IOException;

public class main extends HabboPlugin implements EventListener {
    public static String pluginName = "Better Commands Menu";
    public static String pluginAuthor = "Hackerman";
    public static String version = "1.2.0";
    public static int productId = 3;

    public void onEnable () throws Exception {
        Emulator.getPluginManager().registerEvents(this, this);
        System.out.println ( "[~] Detected plugin `" + pluginName + "` by " + pluginAuthor + " version " + version);
    }

    @EventHandler
    public void onEmulatorLoadedEVERYTHING ( EmulatorLoadedEvent e ) throws IOException {
        if (checkIntegrity.checkIntegrity()) {
            Emulator.getPluginManager().registerEvents(this, this );
            long startTime = System.currentTimeMillis ();
            CommandHandler.addCommand ( new commandCommands () );
            System.out.println ( "[~] Loaded plugin " + pluginName + " " + version + " in " + (System.currentTimeMillis () - startTime) + "ms -> OK!" );
        }
    }

    public void onDisable () throws Exception {
        System.out.println ( "[~] Disabled plugin `" + pluginName + "` by " + pluginAuthor + " version " + version + " -> OK!");
    }

    public boolean hasPermission ( Habbo habbo , String s ) {
        return false;
    }
}