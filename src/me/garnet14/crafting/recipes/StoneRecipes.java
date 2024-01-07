package me.garnet14.crafting.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.StonecuttingRecipe;
import org.bukkit.inventory.meta.Damageable;

import me.garnet14.KappaVanilla;
import me.garnet14.utils.ItemClassUtils;

public class StoneRecipes implements Listener {
	
	private static Map<Player, Long> delay = new HashMap<>();
	
	private List<ShapelessRecipe> shapelessrecipes = new ArrayList<>();
	private List<ShapedRecipe> shapedrecipes = new ArrayList<>();
	private List<StonecuttingRecipe> stonecuttingrecipes = new ArrayList<>();
	private List<FurnaceRecipe> fusedrecipes = new ArrayList<>();
	private List<BlastingRecipe> blastingrecipes = new ArrayList<>();
	
	public StoneRecipes() {
		
		generateCrafting();
		
	}

	private void generateCrafting() {
		
		ShapelessRecipe[] shapelessrecipes = new ShapelessRecipe[8];
		
		shapelessrecipes[0] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_COBBLESTONE".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE));
		
		shapelessrecipes[0].addIngredient(Material.COBBLESTONE);
		shapelessrecipes[0].addIngredient(Material.VINE);
		
		shapelessrecipes[1] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_COBBLESTONE_SLAB".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE_SLAB));
		
		shapelessrecipes[1].addIngredient(Material.COBBLESTONE_SLAB);
		shapelessrecipes[1].addIngredient(Material.VINE);
		
		shapelessrecipes[2] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_COBBLESTONE_STAIRS".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS));
		
		shapelessrecipes[2].addIngredient(Material.COBBLESTONE_STAIRS);
		shapelessrecipes[2].addIngredient(Material.VINE);
		
		shapelessrecipes[3] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_COBBLESTONE_WALL".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE_WALL));
		
		shapelessrecipes[3].addIngredient(Material.COBBLESTONE_WALL);
		shapelessrecipes[3].addIngredient(Material.VINE);
		
		shapelessrecipes[4] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_STONE_BRICKS".toLowerCase()), 
				new ItemStack(Material.MOSSY_STONE_BRICKS));
		
		shapelessrecipes[4].addIngredient(Material.STONE_BRICKS);
		shapelessrecipes[4].addIngredient(Material.VINE);
		
		shapelessrecipes[5] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_STONE_BRICK_SLAB".toLowerCase()), 
				new ItemStack(Material.MOSSY_STONE_BRICK_SLAB));
		
		shapelessrecipes[5].addIngredient(Material.STONE_BRICK_SLAB);
		shapelessrecipes[5].addIngredient(Material.VINE);
		
		shapelessrecipes[6] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_STONE_BRICK_STAIRS".toLowerCase()), 
				new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS));
		
		shapelessrecipes[6].addIngredient(Material.STONE_BRICK_STAIRS);
		shapelessrecipes[6].addIngredient(Material.VINE);
		
		shapelessrecipes[7] = new ShapelessRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "MOSSY_STONE_BRICK_WALL".toLowerCase()), 
				new ItemStack(Material.MOSSY_STONE_BRICK_WALL));
		
		shapelessrecipes[7].addIngredient(Material.STONE_BRICK_WALL);
		shapelessrecipes[7].addIngredient(Material.VINE);
		
		for(ShapelessRecipe recipe : shapelessrecipes)
			this.shapelessrecipes.add(recipe);
		
		ShapedRecipe[] shapedrecipes = new ShapedRecipe[14];
		
		shapedrecipes[0] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "SMOOTH_STONE_SLAB".toLowerCase()),
				new ItemStack(Material.SMOOTH_STONE_SLAB, 3));
		
		shapedrecipes[0].shape("SSS");
		shapedrecipes[0].setIngredient('S', Material.SMOOTH_STONE);
		
		shapedrecipes[1] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_BRICKS".toLowerCase()),
				new ItemStack(Material.STONE_BRICKS, 3));
		
		shapedrecipes[1].shape("SS", "SS");
		shapedrecipes[1].setIngredient('S', Material.STONE);
		
		shapedrecipes[2] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "CHISELED_STONE_BRICKS".toLowerCase()),
				new ItemStack(Material.CHISELED_STONE_BRICKS, 3));
		
		shapedrecipes[2].shape("SS", "SS");
		shapedrecipes[2].setIngredient('S', Material.STONE_BRICKS);
		
		shapedrecipes[3] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_SLAB".toLowerCase()),
				new ItemStack(Material.STONE_SLAB, 3));
		
		shapedrecipes[3].shape("SSS");
		shapedrecipes[3].setIngredient('S', Material.STONE);
		
		shapedrecipes[4] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "COBBLESTONE_SLAB".toLowerCase()),
				new ItemStack(Material.COBBLESTONE_SLAB, 3));
		
		shapedrecipes[4].shape("SSS");
		shapedrecipes[4].setIngredient('S', Material.COBBLESTONE);
		
		shapedrecipes[5] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_BRICK_SLAB".toLowerCase()),
				new ItemStack(Material.STONE_BRICK_SLAB, 3));
		
		shapedrecipes[5].shape("SSS");
		shapedrecipes[5].setIngredient('S', Material.STONE_BRICKS);
		
		shapedrecipes[6] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_STAIRS".toLowerCase() + 1),
				new ItemStack(Material.STONE_STAIRS, 2));
		
		shapedrecipes[6].shape("S  ", "SS ", "SSS");
		shapedrecipes[6].setIngredient('S', Material.STONE);
		
		shapedrecipes[7] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_STAIRS".toLowerCase() + 2),
				new ItemStack(Material.STONE_STAIRS, 2));
		
		shapedrecipes[7].shape("  S", " SS", "SSS");
		shapedrecipes[7].setIngredient('S', Material.STONE);
		
		shapedrecipes[6] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "COBBLESTONE_STAIRS".toLowerCase() + 1),
				new ItemStack(Material.COBBLESTONE_STAIRS, 2));
		
		shapedrecipes[6].shape("S  ", "SS ", "SSS");
		shapedrecipes[6].setIngredient('S', Material.COBBLESTONE);
		
		shapedrecipes[7] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "COBBLESTONE_STAIRS".toLowerCase() + 2),
				new ItemStack(Material.COBBLESTONE_STAIRS, 2));
		
		shapedrecipes[7].shape("  S", " SS", "SSS");
		shapedrecipes[7].setIngredient('S', Material.COBBLESTONE);
		
		shapedrecipes[8] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_BRICK_STAIRS".toLowerCase() + 1),
				new ItemStack(Material.STONE_BRICK_STAIRS, 2));
		
		shapedrecipes[8].shape("S  ", "SS ", "SSS");
		shapedrecipes[8].setIngredient('S', Material.STONE_BRICKS);
		
		shapedrecipes[9] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_BRICK_STAIRS".toLowerCase() + 2),
				new ItemStack(Material.STONE_BRICK_STAIRS, 2));
		
		shapedrecipes[9].shape("  S", " SS", "SSS");
		shapedrecipes[9].setIngredient('S', Material.STONE_BRICKS);
		
		shapedrecipes[10] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "COBBLESTONE_WALL".toLowerCase()),
				new ItemStack(Material.COBBLESTONE_WALL, 3));
		
		shapedrecipes[10].shape("SSS", "SSS");
		shapedrecipes[10].setIngredient('S', Material.COBBLESTONE);
		
		shapedrecipes[11] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_BRICK_STAIRS".toLowerCase()),
				new ItemStack(Material.STONE_BRICK_WALL, 3));
		
		shapedrecipes[11].shape("SSS", "SSS");
		shapedrecipes[11].setIngredient('S', Material.STONE_BRICKS);
		
		shapedrecipes[12] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_PRESSURE_PLATE".toLowerCase()),
				new ItemStack(Material.STONE_PRESSURE_PLATE, 1));
		
		shapedrecipes[12].shape("SS");
		shapedrecipes[12].setIngredient('S', Material.STONE_SLAB);
		
		shapedrecipes[13] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + "STONE_BUTTON".toLowerCase()),
				new ItemStack(Material.STONE_BUTTON, 1));
		
		shapedrecipes[13].shape("S");
		shapedrecipes[13].setIngredient('S', Material.STONE);
		
		for(ShapedRecipe recipe : shapedrecipes)
			this.shapedrecipes.add(recipe);
		
		StonecuttingRecipe[] stonedrecipes = new StonecuttingRecipe[14];
		
		stonedrecipes[0] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "SMOOTH_STONE_SLAB".toLowerCase()), 
				new ItemStack(Material.SMOOTH_STONE_SLAB, 2), 
				Material.SMOOTH_STONE);
		
		stonedrecipes[1] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "STONE_BRICKS".toLowerCase()), 
				new ItemStack(Material.STONE_BRICKS, 1), 
				Material.STONE);
		
		stonedrecipes[2] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "STONE_STAIRS".toLowerCase()), 
				new ItemStack(Material.STONE_STAIRS, 1), 
				Material.STONE);
		
		stonedrecipes[3] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "STONE_SLAB".toLowerCase()), 
				new ItemStack(Material.STONE_SLAB, 2), 
				Material.STONE);
		
		stonedrecipes[4] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "CHISELED_STONE_BRICKS".toLowerCase()), 
				new ItemStack(Material.CHISELED_STONE_BRICKS, 1), 
				Material.STONE_BRICKS);
		
		stonedrecipes[5] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "STONE_BRICK_STAIRS".toLowerCase()), 
				new ItemStack(Material.STONE_BRICK_STAIRS, 1), 
				Material.STONE_BRICKS);
		
		stonedrecipes[6] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "STONE_BRICK_SLAB".toLowerCase()), 
				new ItemStack(Material.STONE_BRICK_SLAB, 2), 
				Material.STONE_BRICKS);
		
		stonedrecipes[7] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "STONE_BRICK_WALL".toLowerCase()), 
				new ItemStack(Material.STONE_BRICK_WALL, 8), 
				Material.STONE_BRICKS);
		
		stonedrecipes[8] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "COBBLESTONE_STAIRS".toLowerCase()), 
				new ItemStack(Material.COBBLESTONE_STAIRS, 1), 
				Material.COBBLESTONE);
		
		stonedrecipes[9] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "COBBLESTONE_SLAB".toLowerCase()), 
				new ItemStack(Material.COBBLESTONE_SLAB, 2), 
				Material.COBBLESTONE);
		
		stonedrecipes[10] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "COBBLESTONE_WALL".toLowerCase()), 
				new ItemStack(Material.COBBLESTONE_WALL, 8), 
				Material.COBBLESTONE);
		
		stonedrecipes[11] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "MOSSY_COBBLESTONE_STAIRS".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS, 1), 
				Material.MOSSY_COBBLESTONE);
		
		stonedrecipes[12] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "MOSSY_COBBLESTONE_SLAB".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE_SLAB, 2), 
				Material.MOSSY_COBBLESTONE);
		
		stonedrecipes[13] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + "MOSSY_COBBLESTONE_WALL".toLowerCase()), 
				new ItemStack(Material.MOSSY_COBBLESTONE_WALL, 8), 
				Material.MOSSY_COBBLESTONE);
		
		for(StonecuttingRecipe recipe : stonedrecipes)
			stonecuttingrecipes.add(recipe);
		
		FurnaceRecipe[] furnaceRecipes = new FurnaceRecipe[5];
		
		furnaceRecipes[0] = new FurnaceRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "furnace_" + "STONE".toLowerCase()), 
				new ItemStack(Material.STONE), 
				Material.COBBLESTONE, 
				2, 20 * 4);
		
		furnaceRecipes[1] = new FurnaceRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "furnace_" + "STONE_STAIRS".toLowerCase()), 
				new ItemStack(Material.STONE_STAIRS), 
				Material.COBBLESTONE_STAIRS, 
				2, 20 * 4);
		
		furnaceRecipes[2] = new FurnaceRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "furnace_" + "STONE_SLAB".toLowerCase()), 
				new ItemStack(Material.STONE_SLAB), 
				Material.COBBLESTONE_SLAB, 
				2, 20 * 4);
		
		furnaceRecipes[3] = new FurnaceRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "furnace_" + "SMOOTH_STONE".toLowerCase()), 
				new ItemStack(Material.SMOOTH_STONE), 
				Material.STONE, 
				2, 20 * 4);
		
		furnaceRecipes[4] = new FurnaceRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "furnace_" + "SMOOTH_STONE_SLAB".toLowerCase()), 
				new ItemStack(Material.SMOOTH_STONE_SLAB), 
				Material.STONE_SLAB, 
				2, 20 * 4);
		
		for(FurnaceRecipe recipe : furnaceRecipes)
			this.fusedrecipes.add(recipe);
		
		blastingrecipes.add(new BlastingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "blasting_" + "STONE".toLowerCase()), 
				new ItemStack(Material.STONE, 2), 
				Material.COBBLESTONE, 
				2, 20 * 2));
		
	}
	
	@EventHandler
	public void strippingWood(PlayerInteractEvent e) {
		
		Player player = e.getPlayer();

		if(e.getAction() == Action.RIGHT_CLICK_AIR) {
			
			ItemStack axe = player.getInventory().getItemInMainHand();
			ItemStack stone = player.getInventory().getItemInOffHand();
			
			if(ItemClassUtils.isAxe(axe)) {
				
				ItemStack cracked;
				
				if(stone.getType() == Material.STONE)
					cracked = new ItemStack(Material.COBBLESTONE);
				else if(stone.getType() == Material.STONE_BRICKS)
					cracked = new ItemStack(Material.CRACKED_STONE_BRICKS);
				else
					return;
				
				if(!delay.containsKey(player)) {
					delay.put(player, System.currentTimeMillis());
				}
				
				else if(delay.containsKey(player) && System.currentTimeMillis() - delay.get(player) < 250)
					return;
				
				if(player.getGameMode() != GameMode.CREATIVE) {
					
					Damageable meta = (Damageable) axe.getItemMeta();
					meta.setDamage(meta.getDamage() + 1);
					axe.setItemMeta(meta);
					
					stone.setAmount(stone.getAmount() - 1);
					
				}
				
				Map<Integer, ItemStack> exceed = player.getInventory().addItem(cracked);
				
				if(exceed != null && !exceed.isEmpty()) {
					for(Integer i : exceed.keySet())
						player.getLocation().getWorld().dropItem(player.getLocation(), exceed.get(i));
				}
				
				delay.put(player, System.currentTimeMillis());
				
			}
			
		}
		
	}

}
