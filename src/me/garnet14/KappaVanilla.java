package me.garnet14;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.garnet14.crafting.recipes.*;

public class KappaVanilla extends JavaPlugin {

	public static KappaVanilla INSTANCE;

	@Override
	public void onEnable() {

		INSTANCE = this;

		loadRecipes();
		loadListener();

		//removeRecipes();

	}

	@Override
	public void onDisable() {

		removeCustomRecipes();

	}

	private void loadRecipes() {

		FlintPickaxeRecipe fpRecipe = new FlintPickaxeRecipe();
		FlintAxeRecipe faRecipe = new FlintAxeRecipe();
		FlintSwordRecipe fsRecipe = new FlintSwordRecipe();

		Bukkit.addRecipe(fpRecipe.getHeadRecipe());
		Bukkit.addRecipe(fpRecipe.getToolRecipe());
		Bukkit.addRecipe(faRecipe.getHeadRecipe());
		Bukkit.addRecipe(faRecipe.getToolRecipe());
		Bukkit.addRecipe(fsRecipe.getHeadRecipe());
		Bukkit.addRecipe(fsRecipe.getToolRecipe());

	}

	private void loadListener() {

		getServer().getPluginManager().registerEvents(new FlintPickaxeRecipe(), this);

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

		Bukkit.removeRecipe(fpRecipe.getHeadRecipe().getKey());
		Bukkit.removeRecipe(fpRecipe.getToolRecipe().getKey());
		Bukkit.removeRecipe(faRecipe.getHeadRecipe().getKey());
		Bukkit.removeRecipe(faRecipe.getToolRecipe().getKey());
		Bukkit.removeRecipe(fsRecipe.getHeadRecipe().getKey());
		Bukkit.removeRecipe(fsRecipe.getToolRecipe().getKey());

	}

}
