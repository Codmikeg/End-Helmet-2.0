package me.Codmikeg.endHelmetTwo;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class endHelmetCommandExecutor implements CommandExecutor {
	endHelmetMain plugin;
	endHelmetDamager dm = new endHelmetDamager(plugin);
	testDamage d = new testDamage(plugin);
	
	public endHelmetCommandExecutor(endHelmetMain plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(commandLabel.equalsIgnoreCase("debugger")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				//dm.dealDamage(player);
				d.dealD(player);
			}
			else{
				plugin.log.warning("You must be a player!");
			}
			
		}
		if(commandLabel.equalsIgnoreCase("debugstop")){
			if(sender instanceof Player){
				//Player player = (Player)sender;
				dm.stopDamage();
			}
			else{
				plugin.log.warning("You must be a player!");
			}
			
		}
		return false;
	}
	
	
	public void dealDamage(final Player player){
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
			public void run(){
				int h = player.getHealth();
				if(player.isDead() == true){
					Bukkit.getScheduler().cancelAllTasks();
				}
				else{
					player.setHealth(h - 2);
					player.playSound(player.getLocation(), Sound.FALL_SMALL, 10, 1);
					h--;
				}
			}
		}, 5, 20);
	}
	
}
