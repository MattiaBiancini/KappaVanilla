package me.garnet14.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintPickaxe extends ItemStack {
	
	public FlintPickaxe() {
		
		super(Material.STONE_PICKAXE);
		
		ItemMeta meta = super.getItemMeta();
		meta.setCustomModelData(1);
		meta.setDisplayName(ChatColor.RESET + "Flint Pickaxe");
		
		this.setItemMeta(meta);
		
	}

}
