package me.Codmikeg.endHelmetTwo;

import org.bukkit.GameMode;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class endHelmetListener implements Listener{
	endHelmetMain plugin;
	public endHelmetListener(endHelmetMain plugin){
		this.plugin = plugin;
	}
	
	@EventHandler
	public void inventoryClick(InventoryClickEvent event){
		HumanEntity player = event.getWhoClicked();
		if(player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.ADVENTURE){}
		else{
			
		}
	}
}
