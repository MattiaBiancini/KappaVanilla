package me.garnet14.crafting.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.RecipeChoice.ExactChoice;

import me.garnet14.KappaVanilla;
import me.garnet14.items.FlintAxe;
import me.garnet14.items.FlintAxeHead;

public class FlintAxeRecipe {
	
	private ShapedRecipe headRecipe;
	private ShapedRecipe toolRecipe;
	private ItemStack head;
	private ItemStack tool;
	
	public FlintAxeRecipe() {
		
		head = new FlintAxeHead();
		tool = new FlintAxe();
		
		headRecipe = new ShapedRecipe(new NamespacedKey(KappaVanilla.INSTANCE, "kappavanilla.flint_axe_head"), head);
		headRecipe.shape("FF", "AA");
		headRecipe.setIngredient('F', new ExactChoice(new ItemStack(Material.FLINT)));
		headRecipe.setIngredient('A', Material.AIR);
		
		toolRecipe = new ShapedRecipe(new NamespacedKey(KappaVanilla.INSTANCE, "kappavanilla.flint_axe"), tool);
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
