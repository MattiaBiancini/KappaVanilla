package me.garnet14.crafting.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.ExactChoice;
import org.bukkit.inventory.ShapedRecipe;

import me.garnet14.KappaVanilla;
import me.garnet14.items.FlintPickaxe;
import me.garnet14.items.FlintPickaxeHead;

public class FlintPickaxeRecipe {
	
	private ShapedRecipe headRecipe;
	private ShapedRecipe toolRecipe;
	private ItemStack head;
	private ItemStack tool;
	
	public FlintPickaxeRecipe() {
		
		head = new FlintPickaxeHead();
		tool = new FlintPickaxe();
		
		headRecipe = new ShapedRecipe(new NamespacedKey(KappaVanilla.INSTANCE, "kappavanilla.flint_pickaxe_head"), head);
		headRecipe.shape("FF", "FA");
		headRecipe.setIngredient('F', new ExactChoice(new ItemStack(Material.FLINT)));
		headRecipe.setIngredient('A', Material.AIR);
		
		toolRecipe = new ShapedRecipe(new NamespacedKey(KappaVanilla.INSTANCE, "kappavanilla.flint_pickaxe"), tool);
		toolRecipe.shape("F", "S");
		toolRecipe.setIngredient('F', new ExactChoice(head));
		toolRecipe.setIngredient('S', Material.STICK);
		
	}

	public ShapedRecipe getHeadRecipe() {
		return headRecipe;
	}

	public ShapedRecipe getToolRecipe() {
		return toolRecipe;
	}

}
