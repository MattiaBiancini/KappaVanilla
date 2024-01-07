package me.garnet14.crafting.recipes.wood;

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
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.StonecuttingRecipe;
import org.bukkit.inventory.meta.Damageable;

import me.garnet14.KappaVanilla;
import me.garnet14.utils.ItemClassUtils;

public class BambooRecipes implements Listener {
	
	private static Map<Player, Long> delay = new HashMap<>();
	private List<ShapedRecipe> cRecipes = new ArrayList<>();
	private List<StonecuttingRecipe> sRecipes = new ArrayList<>();
	
	public BambooRecipes() {
		
		generateRecipes();
		
	}

	private void generateRecipes() {
		
		ShapedRecipe[] cRecipes = new ShapedRecipe[18];
		
		cRecipes[0] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_block"), 
				new ItemStack(Material.BAMBOO_BLOCK));
		
		cRecipes[0].shape("BBB", "BBB", "BBB");
		cRecipes[0].setIngredient('B', Material.BAMBOO);
		
		cRecipes[1] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_planks1"), 
				new ItemStack(Material.BAMBOO_PLANKS, 2));
		
		cRecipes[1].shape("B");
		cRecipes[1].setIngredient('B', Material.BAMBOO_BLOCK);
		
		cRecipes[2] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_planks2"), 
				new ItemStack(Material.BAMBOO_PLANKS, 2));
		
		cRecipes[2].shape("B");
		cRecipes[2].setIngredient('B', Material.STRIPPED_BAMBOO_BLOCK);
		
		cRecipes[3] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_slab"), 
				new ItemStack(Material.BAMBOO_SLAB, 3));
		
		cRecipes[3].shape("BBB");
		cRecipes[3].setIngredient('B', Material.BAMBOO_PLANKS);
		
		cRecipes[4] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_stairs1"), 
				new ItemStack(Material.BAMBOO_STAIRS, 2));
		
		cRecipes[4].shape("B  ", "BB ", "BBB");
		cRecipes[4].setIngredient('B', Material.BAMBOO_PLANKS);
		
		cRecipes[5] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_stairs2"), 
				new ItemStack(Material.BAMBOO_STAIRS, 2));
		
		cRecipes[5].shape("  B", " BB", "BBB");
		cRecipes[5].setIngredient('B', Material.BAMBOO_PLANKS);
		
		cRecipes[6] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_fence"), 
				new ItemStack(Material.BAMBOO_FENCE, 1));
		
		cRecipes[6].shape("S S", "BsB", "BsB");
		cRecipes[6].setIngredient('B', Material.BAMBOO_PLANKS);
		cRecipes[6].setIngredient('s', Material.STICK);
		cRecipes[6].setIngredient('S', Material.BAMBOO_SLAB);
		
		cRecipes[7] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_gate"), 
				new ItemStack(Material.BAMBOO_FENCE_GATE, 1));
		
		cRecipes[7].shape("SBS", "sBs", "SBS");
		cRecipes[7].setIngredient('B', Material.BAMBOO_PLANKS);
		cRecipes[7].setIngredient('s', Material.STICK);
		cRecipes[7].setIngredient('S', Material.BAMBOO_SLAB);
		
		cRecipes[8] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_door"), 
				new ItemStack(Material.BAMBOO_DOOR, 1));
		
		cRecipes[8].shape("BB", "BB", "BB");
		cRecipes[8].setIngredient('B', Material.BAMBOO_PLANKS);
		
		cRecipes[9] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_trapdoor"), 
				new ItemStack(Material.BAMBOO_TRAPDOOR, 2));
		
		cRecipes[9].shape("BBB", "BBB");
		cRecipes[9].setIngredient('B', Material.BAMBOO_PLANKS);
		
		cRecipes[10] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_pressureplate"), 
				new ItemStack(Material.BAMBOO_PRESSURE_PLATE, 2));
		
		cRecipes[10].shape("BB");
		cRecipes[10].setIngredient('B', Material.BAMBOO_SLAB);
		
		cRecipes[11] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_button"), 
				new ItemStack(Material.BAMBOO_BUTTON, 2));
		
		cRecipes[11].shape("B");
		cRecipes[11].setIngredient('B', Material.BAMBOO_PLANKS);
		
		cRecipes[12] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_sign1"), 
				new ItemStack(Material.BAMBOO_SIGN, 1));
		
		cRecipes[12].shape("BBB", "BBB", " S ");
		cRecipes[12].setIngredient('B', Material.BAMBOO_PLANKS);
		cRecipes[12].setIngredient('S', Material.STICK);
		
		cRecipes[13] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_sign2"), 
				new ItemStack(Material.BAMBOO_SIGN, 4));
		
		cRecipes[13].shape("BBB", "BBB", " S ");
		cRecipes[13].setIngredient('B', Material.STRIPPED_BAMBOO_BLOCK);
		cRecipes[13].setIngredient('S', Material.STICK);
		
		cRecipes[14] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_hsign1"), 
				new ItemStack(Material.BAMBOO_HANGING_SIGN, 1));
		
		cRecipes[14].shape("CSC", "BBB", "BBB");
		cRecipes[14].setIngredient('B', Material.BAMBOO_PLANKS);
		cRecipes[14].setIngredient('S', Material.STICK);
		cRecipes[14].setIngredient('S', Material.CHAIN);
		
		cRecipes[15] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_hsign2"), 
				new ItemStack(Material.BAMBOO_HANGING_SIGN, 4));
		
		cRecipes[15].shape("CSC", "BBB", "BBB");
		cRecipes[15].setIngredient('B', Material.STRIPPED_BAMBOO_BLOCK);
		cRecipes[15].setIngredient('S', Material.STICK);
		cRecipes[15].setIngredient('S', Material.CHAIN);
		
		cRecipes[16] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_boat"), 
				new ItemStack(Material.BAMBOO_RAFT, 1));
		
		cRecipes[16].shape("BSB", "BBB");
		cRecipes[16].setIngredient('B', Material.BAMBOO_PLANKS);
		cRecipes[16].setIngredient('S', Material.WOODEN_SHOVEL);
		
		cRecipes[17] = new ShapedRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "crafting_bamboo_chestboat"), 
				new ItemStack(Material.BAMBOO_CHEST_RAFT, 1));
		
		cRecipes[17].shape(" C ", "BSB", "BBB");
		cRecipes[17].setIngredient('B', Material.BAMBOO_PLANKS);
		cRecipes[17].setIngredient('S', Material.WOODEN_SHOVEL);
		cRecipes[17].setIngredient('S', Material.CHEST);
		
		for(ShapedRecipe recipe : cRecipes)
			this.cRecipes.add(recipe);
		
		StonecuttingRecipe[] sRecipes = new StonecuttingRecipe[15];
		
		sRecipes[0] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_BLOCK.toString().toLowerCase() 
						+ "_to_" + Material.STRIPPED_BAMBOO_BLOCK.toString().toLowerCase()), 
				new ItemStack(Material.STRIPPED_BAMBOO_BLOCK, 1), 
				Material.BAMBOO_BLOCK);
		
		sRecipes[1] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_BLOCK.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_PLANKS.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_PLANKS, 6), 
				Material.BAMBOO_BLOCK);
		
		sRecipes[2] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_BLOCK.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_MOSAIC.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_MOSAIC, 6), 
				Material.BAMBOO_BLOCK);
		
		sRecipes[3] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_MOSAIC.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_MOSAIC, 1), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[4] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_SLAB.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_SLAB, 2), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[5] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_MOSAIC_SLAB.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_MOSAIC_SLAB, 2), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[6] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_STAIRS.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_STAIRS, 1), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[7] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_MOSAIC_STAIRS.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_MOSAIC_STAIRS, 1), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[8] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_FENCE.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_FENCE, 1), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[9] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_FENCE_GATE.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_FENCE_GATE, 1), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[10] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_DOOR.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_DOOR, 1), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[11] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_TRAPDOOR.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_TRAPDOOR, 2), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[12] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_PRESSURE_PLATE.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_PRESSURE_PLATE, 2), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[13] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.BAMBOO_BUTTON.toString().toLowerCase()), 
				new ItemStack(Material.BAMBOO_BUTTON, 2), 
				Material.BAMBOO_PLANKS);
		
		sRecipes[14] = new StonecuttingRecipe(
				new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + Material.BAMBOO_PLANKS.toString().toLowerCase() 
						+ "_to_" + Material.STICK.toString().toLowerCase()), 
				new ItemStack(Material.STICK, 6), 
				Material.BAMBOO_PLANKS);
		
		for(StonecuttingRecipe recipe : sRecipes)
			this.sRecipes.add(recipe);
		
	}
	
	@EventHandler
	public void strippingWood(PlayerInteractEvent e) {
		
		Player player = e.getPlayer();

		if(e.getAction() == Action.RIGHT_CLICK_AIR) {
			
			ItemStack axe = player.getInventory().getItemInMainHand();
			ItemStack wood = player.getInventory().getItemInOffHand();
			
			if(ItemClassUtils.isAxe(axe) && wood.getType() == Material.BAMBOO_BLOCK) {
				
				if(!delay.containsKey(player)) {
					delay.put(player, System.currentTimeMillis());
				}
				
				else if(delay.containsKey(player) && System.currentTimeMillis() - delay.get(player) < 250)
					return;
				
				ItemStack swoods = new ItemStack(Material.STRIPPED_BAMBOO_BLOCK);
				
				if(player.getGameMode() != GameMode.CREATIVE) {
					
					Damageable meta = (Damageable) axe.getItemMeta();
					meta.setDamage(meta.getDamage() + 1);
					axe.setItemMeta(meta);
					
					wood.setAmount(wood.getAmount() - 1);
					
				}
				
				Map<Integer, ItemStack> exceed = player.getInventory().addItem(swoods);
				
				if(exceed != null && !exceed.isEmpty()) {
					for(Integer i : exceed.keySet())
						player.getLocation().getWorld().dropItem(player.getLocation(), exceed.get(i));
				}
				
				delay.put(player, System.currentTimeMillis());
				
			}
			
		}
		
	}

	public List<ShapedRecipe> getcRecipes() {
		return cRecipes;
	}

	public List<StonecuttingRecipe> getsRecipes() {
		return sRecipes;
	}

}
