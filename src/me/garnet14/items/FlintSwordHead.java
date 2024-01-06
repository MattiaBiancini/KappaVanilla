package me.garnet14.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintSwordHead extends ItemStack {
	
	public FlintSwordHead() {
		
		super(Material.FLINT);
		
		ItemMeta meta = super.getItemMeta();
		meta.setCustomModelData(3);
		meta.setDisplayName(ChatColor.RESET + "Flint Sword Head");
		
		this.setItemMeta(meta);
		
	}
}
