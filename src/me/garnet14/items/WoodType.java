package me.garnet14.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;

public enum WoodType {

	OAK,
	SPRUCE,
	BIRCH,
	JUNGLE,
	ACACIA,
	DARK_OAK,
	MANGROVE,
	CRIMSON,
	WARPED,
	CHERRY;

	@Override
    public String toString() {
        return this.name().toLowerCase();
    }
	
	public static MaterialChoice getAllLogs() {

		return new MaterialChoice(
				Material.OAK_LOG,
				Material.SPRUCE_LOG,
				Material.BIRCH_LOG,
				Material.JUNGLE_LOG,
				Material.ACACIA_LOG,
				Material.DARK_OAK_LOG,
				Material.MANGROVE_LOG,
				Material.CRIMSON_STEM,
				Material.WARPED_STEM,
				Material.CHERRY_LOG);

	}

	public static MaterialChoice getAllPlanks() {

		return new MaterialChoice(
				Material.OAK_PLANKS,
				Material.SPRUCE_PLANKS,
				Material.BIRCH_PLANKS,
				Material.JUNGLE_PLANKS,
				Material.ACACIA_PLANKS,
				Material.DARK_OAK_PLANKS,
				Material.MANGROVE_PLANKS,
				Material.CRIMSON_PLANKS,
				Material.WARPED_PLANKS,
				Material.CHERRY_PLANKS);

	}

	public static MaterialChoice getAllSlabs() {

		return new MaterialChoice(
				Material.OAK_SLAB,
				Material.SPRUCE_SLAB,
				Material.BIRCH_SLAB,
				Material.JUNGLE_SLAB,
				Material.ACACIA_SLAB,
				Material.DARK_OAK_SLAB,
				Material.MANGROVE_SLAB,
				Material.CRIMSON_SLAB,
				Material.WARPED_SLAB,
				Material.CHERRY_SLAB);

	}

	public static MaterialChoice getAllStairs() {

		return new MaterialChoice(
				Material.OAK_STAIRS,
				Material.SPRUCE_STAIRS,
				Material.BIRCH_STAIRS,
				Material.JUNGLE_STAIRS,
				Material.ACACIA_STAIRS,
				Material.DARK_OAK_STAIRS,
				Material.MANGROVE_STAIRS,
				Material.CRIMSON_STAIRS,
				Material.WARPED_STAIRS,
				Material.CHERRY_STAIRS);

	}

	public static MaterialChoice getAllWoods() {

		return new MaterialChoice(
				Material.OAK_WOOD,
				Material.SPRUCE_WOOD,
				Material.BIRCH_WOOD,
				Material.JUNGLE_WOOD,
				Material.ACACIA_WOOD,
				Material.DARK_OAK_WOOD,
				Material.MANGROVE_WOOD,
				Material.CRIMSON_HYPHAE,
				Material.WARPED_HYPHAE,
				Material.CHERRY_WOOD);

	}
	
	public static MaterialChoice getAllStrippedLogs() {

		return new MaterialChoice(
				Material.STRIPPED_OAK_LOG,
				Material.STRIPPED_SPRUCE_LOG,
				Material.STRIPPED_BIRCH_LOG,
				Material.STRIPPED_JUNGLE_LOG,
				Material.STRIPPED_ACACIA_LOG,
				Material.STRIPPED_DARK_OAK_LOG,
				Material.STRIPPED_MANGROVE_LOG,
				Material.STRIPPED_CRIMSON_STEM,
				Material.STRIPPED_WARPED_STEM,
				Material.STRIPPED_CHERRY_LOG);

	}
	
	public static MaterialChoice getAllStrippedWoods() {

		return new MaterialChoice(
				Material.STRIPPED_OAK_WOOD,
				Material.STRIPPED_SPRUCE_WOOD,
				Material.STRIPPED_BIRCH_WOOD,
				Material.STRIPPED_JUNGLE_WOOD,
				Material.STRIPPED_ACACIA_WOOD,
				Material.STRIPPED_DARK_OAK_WOOD,
				Material.STRIPPED_MANGROVE_WOOD,
				Material.STRIPPED_CRIMSON_HYPHAE,
				Material.STRIPPED_WARPED_HYPHAE,
				Material.STRIPPED_CHERRY_WOOD);

	}
	
	public static MaterialChoice getAllFences() {
		
		return new MaterialChoice(
				Material.OAK_FENCE,
				Material.SPRUCE_FENCE,
				Material.BIRCH_FENCE,
				Material.JUNGLE_FENCE,
				Material.ACACIA_FENCE,
				Material.DARK_OAK_FENCE,
				Material.MANGROVE_FENCE,
				Material.CRIMSON_FENCE,
				Material.WARPED_FENCE,
				Material.CHERRY_FENCE);
		
	}
	
	public static MaterialChoice getAllGates() {
		
		return new MaterialChoice(
				Material.OAK_FENCE_GATE,
				Material.SPRUCE_FENCE_GATE,
				Material.BIRCH_FENCE_GATE,
				Material.JUNGLE_FENCE_GATE,
				Material.ACACIA_FENCE_GATE,
				Material.DARK_OAK_FENCE_GATE,
				Material.MANGROVE_FENCE_GATE,
				Material.CRIMSON_FENCE_GATE,
				Material.WARPED_FENCE_GATE,
				Material.CHERRY_FENCE_GATE);
		
	}
	
	public static MaterialChoice getAllDoors() {
		
		return new MaterialChoice(
				Material.OAK_DOOR,
				Material.SPRUCE_DOOR,
				Material.BIRCH_DOOR,
				Material.JUNGLE_DOOR,
				Material.ACACIA_DOOR,
				Material.DARK_OAK_DOOR,
				Material.MANGROVE_DOOR,
				Material.CRIMSON_DOOR,
				Material.WARPED_DOOR,
				Material.CHERRY_DOOR);
		
	}
	
	public static MaterialChoice getAllTrapdoors() {
		
		return new MaterialChoice(
				Material.OAK_TRAPDOOR,
				Material.SPRUCE_TRAPDOOR,
				Material.BIRCH_TRAPDOOR,
				Material.JUNGLE_TRAPDOOR,
				Material.ACACIA_TRAPDOOR,
				Material.DARK_OAK_TRAPDOOR,
				Material.MANGROVE_TRAPDOOR,
				Material.CRIMSON_TRAPDOOR,
				Material.WARPED_TRAPDOOR,
				Material.CHERRY_TRAPDOOR);
		
	}
	
	public static MaterialChoice getAllPressurePlates() {
		
		return new MaterialChoice(
				Material.OAK_PRESSURE_PLATE,
				Material.SPRUCE_PRESSURE_PLATE,
				Material.BIRCH_PRESSURE_PLATE,
				Material.JUNGLE_PRESSURE_PLATE,
				Material.ACACIA_PRESSURE_PLATE,
				Material.DARK_OAK_PRESSURE_PLATE,
				Material.MANGROVE_PRESSURE_PLATE,
				Material.CRIMSON_PRESSURE_PLATE,
				Material.WARPED_PRESSURE_PLATE,
				Material.CHERRY_PRESSURE_PLATE);
		
	}
	
	public static MaterialChoice getAllButtons() {
		
		return new MaterialChoice(
				Material.OAK_BUTTON,
				Material.SPRUCE_BUTTON,
				Material.BIRCH_BUTTON,
				Material.JUNGLE_BUTTON,
				Material.ACACIA_BUTTON,
				Material.DARK_OAK_BUTTON,
				Material.MANGROVE_BUTTON,
				Material.CRIMSON_BUTTON,
				Material.WARPED_BUTTON,
				Material.CHERRY_BUTTON);
		
	}
	
	public static MaterialChoice getAllSigns() {
		
		return new MaterialChoice(
				Material.OAK_SIGN,
				Material.SPRUCE_SIGN,
				Material.BIRCH_SIGN,
				Material.JUNGLE_SIGN,
				Material.ACACIA_SIGN,
				Material.DARK_OAK_SIGN,
				Material.MANGROVE_SIGN,
				Material.CRIMSON_SIGN,
				Material.WARPED_SIGN,
				Material.CHERRY_SIGN);
		
	}
	
	public static MaterialChoice getAllHangingSigns() {
		
		return new MaterialChoice(
				Material.OAK_HANGING_SIGN,
				Material.SPRUCE_HANGING_SIGN,
				Material.BIRCH_HANGING_SIGN,
				Material.JUNGLE_HANGING_SIGN,
				Material.ACACIA_HANGING_SIGN,
				Material.DARK_OAK_HANGING_SIGN,
				Material.MANGROVE_HANGING_SIGN,
				Material.CRIMSON_HANGING_SIGN,
				Material.WARPED_HANGING_SIGN,
				Material.CHERRY_HANGING_SIGN);
		
	}
	
	public static MaterialChoice getAllBoats() {
		
		return new MaterialChoice(
				Material.OAK_BOAT,
				Material.SPRUCE_BOAT,
				Material.BIRCH_BOAT,
				Material.JUNGLE_BOAT,
				Material.ACACIA_BOAT,
				Material.DARK_OAK_BOAT,
				Material.MANGROVE_BOAT,
				Material.CHERRY_BOAT);
		
	}
	
	public static MaterialChoice getAllChestBoats() {
		
		return new MaterialChoice(
				Material.OAK_CHEST_BOAT,
				Material.SPRUCE_CHEST_BOAT,
				Material.BIRCH_CHEST_BOAT,
				Material.JUNGLE_CHEST_BOAT,
				Material.ACACIA_CHEST_BOAT,
				Material.DARK_OAK_CHEST_BOAT,
				Material.MANGROVE_CHEST_BOAT,
				Material.CHERRY_CHEST_BOAT);
		
	}
	
 	public static MaterialChoice getLogs() {
		
		return new MaterialChoice(
				Material.OAK_LOG,
				Material.SPRUCE_LOG,
				Material.BIRCH_LOG,
				Material.JUNGLE_LOG,
				Material.ACACIA_LOG,
				Material.DARK_OAK_LOG,
				Material.MANGROVE_LOG,
				Material.CRIMSON_STEM,
				Material.WARPED_STEM,
				Material.CHERRY_LOG,
				Material.OAK_WOOD,
				Material.SPRUCE_WOOD,
				Material.BIRCH_WOOD,
				Material.JUNGLE_WOOD,
				Material.ACACIA_WOOD,
				Material.DARK_OAK_WOOD,
				Material.MANGROVE_WOOD,
				Material.CRIMSON_HYPHAE,
				Material.WARPED_HYPHAE,
				Material.CHERRY_WOOD,
				Material.STRIPPED_OAK_LOG,
				Material.STRIPPED_SPRUCE_LOG,
				Material.STRIPPED_BIRCH_LOG,
				Material.STRIPPED_JUNGLE_LOG,
				Material.STRIPPED_ACACIA_LOG,
				Material.STRIPPED_DARK_OAK_LOG,
				Material.STRIPPED_MANGROVE_LOG,
				Material.STRIPPED_CRIMSON_STEM,
				Material.STRIPPED_WARPED_STEM,
				Material.STRIPPED_CHERRY_LOG,
				Material.STRIPPED_OAK_WOOD,
				Material.STRIPPED_SPRUCE_WOOD,
				Material.STRIPPED_BIRCH_WOOD,
				Material.STRIPPED_JUNGLE_WOOD,
				Material.STRIPPED_ACACIA_WOOD,
				Material.STRIPPED_DARK_OAK_WOOD,
				Material.STRIPPED_MANGROVE_WOOD,
				Material.STRIPPED_CRIMSON_HYPHAE,
				Material.STRIPPED_WARPED_HYPHAE,
				Material.STRIPPED_CHERRY_WOOD);
		
	}
 	
	public static boolean isLog(Material material) {

		return getLogs().test(new ItemStack(material));

	}
	
	public static boolean isUnstripped(Material material) {
		
		return getAllLogs().test(new ItemStack(material)) || getAllWoods().test(new ItemStack(material));
		
	}

}
