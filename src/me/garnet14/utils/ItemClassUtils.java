package me.garnet14.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;

public class ItemClassUtils {
	
	public static final MaterialChoice sword = new MaterialChoice(
			Material.WOODEN_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLDEN_SWORD,
			Material.DIAMOND_SWORD,
			Material.NETHERITE_SWORD);
	
	public static final MaterialChoice axe = new MaterialChoice(
			Material.WOODEN_AXE,
			Material.STONE_AXE,
			Material.IRON_AXE,
			Material.GOLDEN_AXE,
			Material.DIAMOND_AXE,
			Material.NETHERITE_AXE);
	
	public static final MaterialChoice pickaxe = new MaterialChoice(
			Material.WOODEN_PICKAXE,
			Material.STONE_PICKAXE,
			Material.IRON_PICKAXE,
			Material.GOLDEN_PICKAXE,
			Material.DIAMOND_PICKAXE,
			Material.NETHERITE_PICKAXE);
	
	public static final MaterialChoice shovel = new MaterialChoice(
			Material.WOODEN_SHOVEL,
			Material.STONE_SHOVEL,
			Material.IRON_SHOVEL,
			Material.GOLDEN_SHOVEL,
			Material.DIAMOND_SHOVEL,
			Material.NETHERITE_SHOVEL);
	
	public static final MaterialChoice hoe = new MaterialChoice(
			Material.WOODEN_HOE,
			Material.STONE_HOE,
			Material.IRON_HOE,
			Material.GOLDEN_HOE,
			Material.DIAMOND_HOE,
			Material.NETHERITE_HOE);
	
	public static final MaterialChoice helmet = new MaterialChoice(
			Material.LEATHER_HELMET,
			Material.CHAINMAIL_HELMET,
			Material.IRON_HELMET,
			Material.GOLDEN_HELMET,
			Material.DIAMOND_HELMET,
			Material.NETHERITE_HELMET,
			Material.TURTLE_HELMET);
	
	public static final MaterialChoice chestplate = new MaterialChoice(
			Material.LEATHER_CHESTPLATE,
			Material.CHAINMAIL_CHESTPLATE,
			Material.IRON_CHESTPLATE,
			Material.GOLDEN_CHESTPLATE,
			Material.DIAMOND_CHESTPLATE,
			Material.NETHERITE_CHESTPLATE);
	
	public static final MaterialChoice leggings = new MaterialChoice(
			Material.LEATHER_LEGGINGS,
			Material.CHAINMAIL_LEGGINGS,
			Material.IRON_LEGGINGS,
			Material.GOLDEN_LEGGINGS,
			Material.DIAMOND_LEGGINGS,
			Material.NETHERITE_LEGGINGS);
	
	public static final MaterialChoice boots = new MaterialChoice(
			Material.LEATHER_BOOTS,
			Material.CHAINMAIL_BOOTS,
			Material.IRON_BOOTS,
			Material.GOLDEN_BOOTS,
			Material.DIAMOND_BOOTS,
			Material.NETHERITE_BOOTS);

	public static final MaterialChoice ranged = new MaterialChoice(
			Material.BOW,
			Material.CROSSBOW);
	
	public static boolean isSword(ItemStack item) {
		return sword.test(item);
	}
	public static boolean isAxe(ItemStack item) {
		return axe.test(item);
	}
	public static boolean isPickaxe(ItemStack item) {
		return pickaxe.test(item);
	}
	public static boolean isShovel(ItemStack item) {
		return shovel.test(item);
	}
	public static boolean isHoe(ItemStack item) {
		return hoe.test(item);
	}
	public static boolean isHelmet(ItemStack item) {
		return helmet.test(item);
	}
	public static boolean isChestplate(ItemStack item) {
		return chestplate.test(item);
	}
	public static boolean isLeggings(ItemStack item) {
		return leggings.test(item);
	}
	public static boolean isBoots(ItemStack item) {
		return boots.test(item);
	}
	public static boolean isRanged(ItemStack item) {
		return ranged.test(item);
	}
	
	public static boolean isAny(ItemStack item) {
		
		if(isArmor(item))
			return true;
		
		if(isExtendedTool(item))
			return true;
		
		if(isRanged(item))
			return true;
		
		if(item.getType() == Material.TRIDENT)
			return true;
		
		if(item.getType() == Material.FISHING_ROD)
			return true;
		
		if(item.getType() == Material.FLINT_AND_STEEL)
			return true;
		
		if(item.getType() == Material.SHEARS)
			return true;
		
		return false;
		
	}
	
	public static boolean isArmor(ItemStack item) {
		
		if(isHelmet(item))
			return true;
		
		if(isChestplate(item))
			return true;
		
		if(isLeggings(item))
			return true;
		
		if(isBoots(item))
			return true;
		
		return false;
	}
	
	public static boolean isTool(ItemStack item) {
		
		if(isAxe(item) || isPickaxe(item) || isShovel(item) || isHoe(item))
			return true;
		
		return false;
		
	}
	
	public static boolean isExtendedTool(ItemStack item) {
		
		if(isSword(item) || isTool(item))
			return true;
		
		return false;
		
	}
	
	public static boolean isWeapon(ItemStack item) {
		
		return (isSword(item) || isAxe(item));
		
	}

}
