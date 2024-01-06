package me.garnet14.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintAxeHead extends ItemStack {
	
	public FlintAxeHead() {
		
		super(Material.FLINT);
		
		ItemMeta meta = super.getItemMeta();
		meta.setCustomModelData(2);
		meta.setDisplayName(ChatColor.RESET + "Flint Axe Head");
		
		this.setItemMeta(meta);
		
	}
}
