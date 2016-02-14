package com.taahthephoenix.freedomhostingmod;

import com.taahthephoenix.freedomhostingmod.commands.Command_fhm;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;

public class FreedomHostingMod extends AeroPlugin {
    public static FreedomHostingMod plugin;
    public static YamlConfig config;
    public static AeroCommandHandler handler;
    
    @Override
    public void load(){
        this.plugin = this;
    }
    
    @Override
    public void enable(){
        getLogger().info("FreedomHosting Mod enabled! Made by AvalancheYT and TaahThePhoenix");
        
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.loadFrom(Command_fhm.class.getPackage());
        handler.registerAll();
    }
    
    @Override
    public void disable(){
        getLogger().info("FreedomHosting Mod disabled! Made by AvalancheYT and TaahThePhoenix");
    }
}
