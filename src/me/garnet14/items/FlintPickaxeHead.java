package me.garnet14.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintPickaxeHead extends ItemStack {
	
	public FlintPickaxeHead() {
		
		super(Material.FLINT);
		
		ItemMeta meta = super.getItemMeta();
		meta.setCustomModelData(1);
		meta.setDisplayName(ChatColor.RESET + "Flint Pickaxe Head");
		
		this.setItemMeta(meta);
		
	}

}
