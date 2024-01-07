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
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.StonecuttingRecipe;
import org.bukkit.inventory.meta.Damageable;

import me.garnet14.KappaVanilla;
import me.garnet14.items.WoodType;
import me.garnet14.utils.ItemClassUtils;

public class LogsRecipes implements Listener {
	
	private static Map<Player, Long> delay = new HashMap<>();
	
	private List<Material> logs = WoodType.getAllLogs().getChoices();
	private List<Material> woods = WoodType.getAllWoods().getChoices();
	private List<Material> slogs = WoodType.getAllStrippedLogs().getChoices();
	private List<Material> swoods = WoodType.getAllStrippedWoods().getChoices();
	
	private List<Recipe> recipes = new ArrayList<>();
	
	public LogsRecipes() {
		
		generateRecipes();
		
	}

	private void generateRecipes() {
		
		for(int i = 0; i < logs.size(); i++) {
			
			Material log = logs.get(i);
			Material wood = woods.get(i);
			Material slog = slogs.get(i);
			Material swood = swoods.get(i);
			
			ShapedRecipe[] temp_recipes = new ShapedRecipe[4];
			Material[] mats = new Material[4];
			
			//----------------------------------------------------------------
			// Adding Recipe for crafting table
			//----------------------------------------------------------------
			
			temp_recipes[0] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "transmutation_" + wood.toString().toLowerCase()), 
					new ItemStack(wood, 4));
			
			temp_recipes[0].shape("II", "II");
			temp_recipes[0].setIngredient('I', log);
			
			temp_recipes[1] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "transmutation_" + log.toString().toLowerCase()), 
					new ItemStack(log, 4));
			
			temp_recipes[1].shape("II", "II");
			temp_recipes[1].setIngredient('I', wood);
			
			temp_recipes[2] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "transmutation_" + swood.toString().toLowerCase()), 
					new ItemStack(swood, 4));
			
			temp_recipes[2].shape("II", "II");
			temp_recipes[2].setIngredient('I', slog);
			
			temp_recipes[3] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "transmutation_" + slog.toString().toLowerCase()), 
					new ItemStack(slog, 4));
			
			temp_recipes[3].shape("II", "II");
			temp_recipes[3].setIngredient('I', swood);
			
			for(ShapedRecipe recipe : temp_recipes)
				recipes.add(recipe);
			
			//----------------------------------------------------------------
			// Adding Recipe for stonecutter
			//----------------------------------------------------------------
			
			mats[0] = log;
			mats[1] = wood;
			mats[2] = slog;
			mats[3] = swood;
			
			for(int j = 0; j < mats.length; j++) {
				for(int k = 0; k < mats.length; k++) {
					
					if(j != k) {
						StonecuttingRecipe recipe = new StonecuttingRecipe(
								new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + mats[j].toString().toLowerCase() + "_to_" + mats[k]), 
										new ItemStack(mats[k]), 
										mats[j]);
						
						recipes.add(recipe);
					}
					
				}
			}
			
		}
		
	}

	@EventHandler
	public void strippingWood(PlayerInteractEvent e) {
		
		Player player = e.getPlayer();

		if(e.getAction() == Action.RIGHT_CLICK_AIR) {
			
			ItemStack axe = player.getInventory().getItemInMainHand();
			ItemStack wood = player.getInventory().getItemInOffHand();
			
			if(ItemClassUtils.isAxe(axe) && WoodType.isUnstripped(wood.getType())) {
				
				if(!delay.containsKey(player)) {
					delay.put(player, System.currentTimeMillis());
				}
				
				else if(delay.containsKey(player) && System.currentTimeMillis() - delay.get(player) < 250)
					return;
				
				ItemStack swoods = new ItemStack(Material.getMaterial("STRIPPED_" + wood.getType().toString()));
				
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
	
	public List<Recipe> getRecipes() {
		return recipes;
	}
	
}
