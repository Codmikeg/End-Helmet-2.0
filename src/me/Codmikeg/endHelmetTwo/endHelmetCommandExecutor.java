package me.Codmikeg.endHelmetTwo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class endHelmetCommandExecutor implements CommandExecutor {
	endHelmetMain plugin;
	
	public endHelmetCommandExecutor(endHelmetMain plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(commandLabel.equalsIgnoreCase("debugger")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				player.sendMessage("It works!");
			}
			else{
				plugin.log.warning("You must be a player!");
			}
			
		}
		return false;
	}
}
