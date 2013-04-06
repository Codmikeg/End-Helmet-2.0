package me.Codmikeg.endHelmetTwo;


import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class endHelmetFullArmourCheck {
	endHelmetMain plugin;
	endHelmetDamager dm = new endHelmetDamager(plugin);
	
	public endHelmetFullArmourCheck(endHelmetMain plugin){
		this.plugin = plugin;
	}
	
	public void armourCheck(Player player){
		ItemStack h = player.getInventory().getHelmet();
		ItemStack c = player.getInventory().getChestplate();
		ItemStack l = player.getInventory().getLeggings();
		ItemStack b = player.getInventory().getBoots();
		
		if(h != null && h.getType() != Material.AIR && c != null && c.getType() != Material.AIR && l != null && l.getType() != Material.AIR && b != null && b.getType() != Material.AIR){
				if(h.getType() == Material.GLASS && c.getType() == Material.LEATHER_CHESTPLATE && l.getType() == Material.LEATHER_LEGGINGS && b.getType() == Material.LEATHER_BOOTS){
					ItemMeta metaC = c.getItemMeta();
					ItemMeta metaL = l.getItemMeta();
					ItemMeta metaB = b.getItemMeta();
					LeatherArmorMeta metaChest = (LeatherArmorMeta) metaC;
					LeatherArmorMeta metaLeggings = (LeatherArmorMeta) metaL;
					LeatherArmorMeta metaBoots = (LeatherArmorMeta) metaB;
					if(metaChest.getColor().equals(Color.WHITE) && metaLeggings.getColor().equals(Color.WHITE) && metaBoots.getColor().equals(Color.WHITE)){
						dm.stopDamage();
					}
					else{
						dm.dealDamage(player);
					}
				}
				else{
					
				}
			}
			else{
			
			}
		}

							
					
		
	public void elseArmour(Player player){
		
	}
}
