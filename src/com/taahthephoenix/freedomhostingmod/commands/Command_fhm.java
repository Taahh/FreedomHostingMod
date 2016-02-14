package com.taahthephoenix.freedomhostingmod.commands;

import com.taahthephoenix.freedomhostingmod.FreedomHostingMod;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(source = SourceType.ANY, permission = "utils.fhm")
public class Command_fhm extends SimpleCommand {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    
        sender.sendMessage(ChatColor.DARK_RED + "======FreedomHostingMod======");
        sender.sendMessage(ChatColor.GOLD + "FreedomHostingMod is running on " + plugin.getConfig().getString("server-name"));
        sender.sendMessage(ChatColor.GOLD + "Forums: " + plugin.getConfig().getString("server-forums"));
        return true;
    }
    
    
}
