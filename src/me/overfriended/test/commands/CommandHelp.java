package me.overfriended.test.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.overfriended.test.util.Chat;

public class CommandHelp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("help")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (p.hasPermission("overcore.command.help")) {
					p.sendMessage(Chat.f("&8[&c&lOvercore&8] &fCommand help:"));
					p.sendMessage(Chat.f("&7- &a/help &8- &aCommand help."));
					return true;
				}
			} else {
				sender.sendMessage(Chat.f("&cYou are not a player!"));
			}
		}
		return false;
	}

}
