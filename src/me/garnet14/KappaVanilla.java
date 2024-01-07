package me.garnet14;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.StonecuttingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.garnet14.crafting.recipes.*;
import me.garnet14.crafting.recipes.wood.*;

@SuppressWarnings("unused")
public class KappaVanilla extends JavaPlugin {

	public static KappaVanilla INSTANCE;

	@Override
	public void onEnable() {

		INSTANCE = this;
		
		//	removeRecipes();

		loadRecipes();
		loadListener();

	}

	@Override
	public void onDisable() {

		removeCustomRecipes();

	}

	private void loadRecipes() {

		FlintPickaxeRecipe fpRecipe = new FlintPickaxeRecipe();
		FlintAxeRecipe faRecipe = new FlintAxeRecipe();
		FlintSwordRecipe fsRecipe = new FlintSwordRecipe();
		PlanksRecipes pRecipe = new PlanksRecipes();
		LogsRecipes lRecipe = new LogsRecipes();
		WorkedPlanksRecipes wRecipe = new WorkedPlanksRecipes();
		BambooRecipes bRecipes = new BambooRecipes();

		Bukkit.addRecipe(fpRecipe.getHeadRecipe());
		Bukkit.addRecipe(fpRecipe.getToolRecipe());
		Bukkit.addRecipe(faRecipe.getHeadRecipe());
		Bukkit.addRecipe(faRecipe.getToolRecipe());
		Bukkit.addRecipe(fsRecipe.getHeadRecipe());
		Bukkit.addRecipe(fsRecipe.getToolRecipe());
		
		for(ShapelessRecipe sr : pRecipe.getCrecipes())
			Bukkit.addRecipe(sr);
		for(StonecuttingRecipe sr : pRecipe.getSrecipes())
			Bukkit.addRecipe(sr);
		
		for(Recipe r : lRecipe.getRecipes())
			Bukkit.addRecipe(r);
		
		
		getServer().getPluginManager().registerEvents(lRecipe, this);
		
		for(ShapedRecipe sr : wRecipe.getcRecipes())
			Bukkit.addRecipe(sr);
		for(StonecuttingRecipe sr : wRecipe.getsRecipes())
			Bukkit.addRecipe(sr);
		
		for(ShapedRecipe sr : bRecipes.getcRecipes())
			Bukkit.addRecipe(sr);
		for(StonecuttingRecipe sr : bRecipes.getsRecipes())
			Bukkit.addRecipe(sr);
		
		getServer().getPluginManager().registerEvents(bRecipes, this);

	}

	private void loadListener() {

		

	}

	private void removeRecipes() {
		// Itera su tutte le ricette esistenti e le rimuove
		Bukkit.recipeIterator().forEachRemaining(recipe -> {
			// Verifica se è una ShapedRecipe (ricetta formata)
			if (recipe instanceof ShapedRecipe) {
				// Rimuovi la ricetta
				ShapedRecipe shapedRecipe = (ShapedRecipe) recipe;
				NamespacedKey key = shapedRecipe.getKey();
				Bukkit.removeRecipe(key);
			}
		});
	}

	private void removeCustomRecipes() {

		FlintPickaxeRecipe fpRecipe = new FlintPickaxeRecipe();
		FlintAxeRecipe faRecipe = new FlintAxeRecipe();
		FlintSwordRecipe fsRecipe = new FlintSwordRecipe();
		PlanksRecipes pRecipe = new PlanksRecipes();
		LogsRecipes lRecipe = new LogsRecipes();
		WorkedPlanksRecipes wRecipe = new WorkedPlanksRecipes();
		BambooRecipes bRecipes = new BambooRecipes();

		Bukkit.removeRecipe(fpRecipe.getHeadRecipe().getKey());
		Bukkit.removeRecipe(fpRecipe.getToolRecipe().getKey());
		Bukkit.removeRecipe(faRecipe.getHeadRecipe().getKey());
		Bukkit.removeRecipe(faRecipe.getToolRecipe().getKey());
		Bukkit.removeRecipe(fsRecipe.getHeadRecipe().getKey());
		Bukkit.removeRecipe(fsRecipe.getToolRecipe().getKey());

		for(ShapelessRecipe sr : pRecipe.getCrecipes())
			Bukkit.removeRecipe(sr.getKey());
		for(StonecuttingRecipe sr : pRecipe.getSrecipes())
			Bukkit.removeRecipe(sr.getKey());
		
		for(Recipe r : lRecipe.getRecipes())
			if(r instanceof ShapedRecipe)
				Bukkit.removeRecipe(((ShapedRecipe)r).getKey());
			else if(r instanceof StonecuttingRecipe)
				Bukkit.removeRecipe(((StonecuttingRecipe)r).getKey());
		
		for(ShapedRecipe sr : wRecipe.getcRecipes())
			Bukkit.removeRecipe(sr.getKey());
		for(StonecuttingRecipe sr : wRecipe.getsRecipes())
			Bukkit.removeRecipe(sr.getKey());
		
		for(ShapedRecipe sr : bRecipes.getcRecipes())
			Bukkit.removeRecipe(sr.getKey());
		for(StonecuttingRecipe sr : bRecipes.getsRecipes())
			Bukkit.removeRecipe(sr.getKey());
		
	}

}
