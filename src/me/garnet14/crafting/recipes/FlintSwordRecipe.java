package me.garnet14.crafting.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.RecipeChoice.ExactChoice;

import me.garnet14.KappaVanilla;
import me.garnet14.items.FlintSword;
import me.garnet14.items.FlintSwordHead;

public class FlintSwordRecipe {

	private ShapedRecipe headRecipe;
	private ShapedRecipe toolRecipe;
	private ItemStack head;
	private ItemStack tool;
	
	public FlintSwordRecipe() {
		
		head = new FlintSwordHead();
		tool = new FlintSword();
		
		headRecipe = new ShapedRecipe(new NamespacedKey(KappaVanilla.INSTANCE, "kappavanilla.flint_sword_head"), head);
		headRecipe.shape("AF", "FA");
		headRecipe.setIngredient('F', new ExactChoice(new ItemStack(Material.FLINT)));
		headRecipe.setIngredient('A', Material.AIR);
		
		toolRecipe = new ShapedRecipe(new NamespacedKey(KappaVanilla.INSTANCE, "kappavanilla.flint_sword"), tool);
		toolRecipe.shape(" F", "S ");
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
