package me.Codmikeg.endHelmetTwo;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class endHelmetMain extends JavaPlugin {
	public final Logger log = this.getLogger();


	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new endHelmetListener(this), this);
		getCommand("debugger").setExecutor(new endHelmetCommandExecutor(this));
		getCommand("debugstop").setExecutor(new endHelmetCommandExecutor(this));
		
		
	}
	@Override
	public void onDisable(){
		
	}

}
