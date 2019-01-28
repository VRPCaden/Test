package me.overfriended.test.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Chat {
	
	public static String f(String input) {
		return ChatColor.translateAlternateColorCodes('&', input);
	}
	public static void color(Player p, String input) {
		p.sendMessage(f(input));
	}

}
