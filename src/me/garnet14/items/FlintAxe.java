package me.garnet14.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintAxe extends ItemStack {
	
	public FlintAxe() {
		
		super(Material.STONE_AXE);
		
		ItemMeta meta = super.getItemMeta();
		meta.setCustomModelData(1);
		meta.setDisplayName(ChatColor.RESET + "Flint Axe");
		
		this.setItemMeta(meta);
		
	}

}
