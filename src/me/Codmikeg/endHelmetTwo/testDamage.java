package me.Codmikeg.endHelmetTwo;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class testDamage {
	endHelmetMain plugin;
	
	public testDamage(endHelmetMain plugin){
		this.plugin = plugin;
	}
	
	public void dealD(final Player player){
		if(player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.ADVENTURE){}
		else{
			Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
				public void run(){
					player.sendMessage("Aye it works");
				}
			}, 5, 20);
		}
	}
}
