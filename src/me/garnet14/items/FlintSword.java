package me.garnet14.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintSword  extends ItemStack {
	
	public FlintSword() {
		
		super(Material.STONE_SWORD);
		
		ItemMeta meta = super.getItemMeta();
		meta.setCustomModelData(1);
		meta.setDisplayName(ChatColor.RESET + "Flint Sword");
		
		this.setItemMeta(meta);
		
	}

}
