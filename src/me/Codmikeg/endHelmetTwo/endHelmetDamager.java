package me.Codmikeg.endHelmetTwo;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class endHelmetDamager {
	endHelmetMain plugin;
	
	public endHelmetDamager(endHelmetMain plugin){
		this.plugin = plugin;
	}
	
	//private int taskId;
	public void dealDamage(final Player player){
		if(player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.ADVENTURE){}
		else{
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
	public void stopDamage(){
		//Bukkit.getServer().getScheduler().cancelTask(this.taskId);
	}
	
}
