package me.garnet14.crafting.recipes.wood;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.StonecuttingRecipe;

import me.garnet14.KappaVanilla;
import me.garnet14.items.WoodType;

public class PlanksRecipes {
	
	private List<Material> logs = WoodType.getLogs().getChoices();
	private List<Material> planks = WoodType.getAllPlanks().getChoices();
	private List<ShapelessRecipe> crecipes;
	private List<StonecuttingRecipe> srecipes;
	
	public PlanksRecipes() {
		
		crecipes = new ArrayList<>();
		srecipes = new ArrayList<>();
		
		generateRecipes();
		
	}
	
	public void generateRecipes() {
		
		for(int i = 0; i < planks.size(); i++) {
			
			ShapelessRecipe[] cRecipes = new ShapelessRecipe[4];
			StonecuttingRecipe[] sRecipes = new StonecuttingRecipe[4];
			
			for(int j = 0; j < cRecipes.length; j++) {
				
				cRecipes[j] = new ShapelessRecipe(
						new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + planks.get(i).toString().toLowerCase() + j),
						new ItemStack(planks.get(i), 2));
				
				cRecipes[j].addIngredient(logs.get(planks.size() * j + i));
				
				sRecipes[j] = new StonecuttingRecipe(
						new NamespacedKey(KappaVanilla.INSTANCE, "cutter_" + planks.get(i).toString().toLowerCase() + j),
						new ItemStack(planks.get(i), 6),
						logs.get(planks.size() * j + i));
				
			}
			
			for(ShapelessRecipe sr : cRecipes)
				crecipes.add(sr);
			
			for(StonecuttingRecipe sr : sRecipes)
				srecipes.add(sr);
			
		}
		
	}

	public List<ShapelessRecipe> getCrecipes() {
		return crecipes;
	}

	public List<StonecuttingRecipe> getSrecipes() {
		return srecipes;
	}

	

}
