package me.overfriended.test;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.overfriended.test.commands.CommandHelp;

public class Main extends JavaPlugin {
	
	private static Main instance;

    public Main() {
        instance = this;
    }

    public static Main getInstance() {
        return instance;
    }

	
	public static void setupCommand(CommandExecutor exe, String name) {
		instance.getCommand(name).setExecutor(exe);
	}
	
	public void onEnable() {
		setupCommand(new CommandHelp(), "help");
	}
	
	public void onDisable() {
		
	}

}
