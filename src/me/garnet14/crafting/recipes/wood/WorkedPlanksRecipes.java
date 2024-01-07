package me.garnet14.crafting.recipes.wood;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.StonecuttingRecipe;

import me.garnet14.KappaVanilla;
import me.garnet14.items.WoodType;

public class WorkedPlanksRecipes {

	private List<Material> planks = WoodType.getAllPlanks().getChoices();
	private List<Material> slabs = WoodType.getAllSlabs().getChoices();
	private List<Material> stairs = WoodType.getAllStairs().getChoices();
	private List<Material> doors = WoodType.getAllDoors().getChoices();
	private List<Material> trapdoors = WoodType.getAllTrapdoors().getChoices();
	private List<Material> fences = WoodType.getAllFences().getChoices();
	private List<Material> gates = WoodType.getAllGates().getChoices();
	private List<Material> pressures = WoodType.getAllPressurePlates().getChoices();
	private List<Material> buttons = WoodType.getAllButtons().getChoices();
	private List<Material> boats = WoodType.getAllBoats().getChoices();
	private List<Material> chestboats = WoodType.getAllChestBoats().getChoices();
	private List<Material> signs = WoodType.getAllSigns().getChoices();
	private List<Material> hangingsigns = WoodType.getAllHangingSigns().getChoices();

	private List<ShapedRecipe> cRecipes = new ArrayList<>();
	private List<StonecuttingRecipe> sRecipes = new ArrayList<>();

	public WorkedPlanksRecipes() {

		generateRecipes();

	}

	private void generateRecipes() {

		for(int i = 0; i < planks.size(); i++) {
			
			//----------------------------------------------------------------
			// Adding Recipe for crafting table
			//----------------------------------------------------------------

			ShapedRecipe[] recipes_crafting = new ShapedRecipe[15];

			recipes_crafting[0] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + slabs.get(i).toString().toLowerCase()), 
					new ItemStack(slabs.get(i), 3));

			recipes_crafting[0].shape("PPP");
			recipes_crafting[0].setIngredient('P', planks.get(i));

			recipes_crafting[1] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + stairs.get(i).toString().toLowerCase() + 1), 
					new ItemStack(stairs.get(i), 2));

			recipes_crafting[1].shape("P  ", "PP ", "PPP");
			recipes_crafting[1].setIngredient('P', planks.get(i));

			recipes_crafting[2] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + stairs.get(i).toString().toLowerCase() + 2), 
					new ItemStack(stairs.get(i), 2));

			recipes_crafting[2].shape("  P", " PP", "PPP");
			recipes_crafting[2].setIngredient('P', planks.get(i));

			recipes_crafting[3] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + doors.get(i).toString().toLowerCase()), 
					new ItemStack(doors.get(i), 1));

			recipes_crafting[3].shape("PP ", "PP ", "PP ");
			recipes_crafting[3].setIngredient('P', planks.get(i));

			recipes_crafting[4] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + trapdoors.get(i).toString().toLowerCase()), 
					new ItemStack(trapdoors.get(i), 1));

			recipes_crafting[4].shape("PPP", "PPP");
			recipes_crafting[4].setIngredient('P', planks.get(i));

			recipes_crafting[5] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + fences.get(i).toString().toLowerCase()), 
					new ItemStack(fences.get(i), 1));

			recipes_crafting[5].shape("S S", "PsP", "PsP");
			recipes_crafting[5].setIngredient('P', planks.get(i));
			recipes_crafting[5].setIngredient('S', slabs.get(i));
			recipes_crafting[5].setIngredient('s', Material.STICK);

			recipes_crafting[6] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + gates.get(i).toString().toLowerCase()), 
					new ItemStack(gates.get(i), 1));

			recipes_crafting[6].shape("SPS", "sPs", "SPS");
			recipes_crafting[6].setIngredient('P', planks.get(i));
			recipes_crafting[6].setIngredient('S', slabs.get(i));
			recipes_crafting[6].setIngredient('s', Material.STICK);

			recipes_crafting[7] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + pressures.get(i).toString().toLowerCase()), 
					new ItemStack(pressures.get(i), 1));

			recipes_crafting[7].shape("PP");
			recipes_crafting[7].setIngredient('P', slabs.get(i));

			recipes_crafting[8] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + buttons.get(i).toString().toLowerCase()), 
					new ItemStack(buttons.get(i), 1));

			recipes_crafting[8].shape("P");
			recipes_crafting[8].setIngredient('P', planks.get(i));

			recipes_crafting[9] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + hangingsigns.get(i).toString().toLowerCase() + 1), 
					new ItemStack(hangingsigns.get(i), 1));

			recipes_crafting[9].shape("CsC", "PPP", "PPP");
			recipes_crafting[9].setIngredient('P', planks.get(i));
			recipes_crafting[9].setIngredient('C', Material.CHAIN);
			recipes_crafting[9].setIngredient('s', Material.STICK);

			recipes_crafting[10] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + hangingsigns.get(i).toString().toLowerCase() + 2), 
					new ItemStack(hangingsigns.get(i), 4));

			recipes_crafting[10].shape("CsC", "PPP", "PPP");
			recipes_crafting[10].setIngredient('P', WoodType.getAllStrippedLogs().getChoices().get(i));
			recipes_crafting[10].setIngredient('C', Material.CHAIN);
			recipes_crafting[10].setIngredient('s', Material.STICK);

			recipes_crafting[11] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + signs.get(i).toString().toLowerCase() + 1), 
					new ItemStack(signs.get(i), 1));

			recipes_crafting[11].shape("PPP", "PPP", " s ");
			recipes_crafting[11].setIngredient('P', planks.get(i));
			recipes_crafting[11].setIngredient('s', Material.STICK);

			recipes_crafting[12] = new ShapedRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + signs.get(i).toString().toLowerCase() + 2), 
					new ItemStack(signs.get(i), 4));

			recipes_crafting[12].shape("PPP", "PPP", " s ");
			recipes_crafting[12].setIngredient('P', WoodType.getAllStrippedLogs().getChoices().get(i));
			recipes_crafting[12].setIngredient('s', Material.STICK);

			if(planks.get(i) != Material.CRIMSON_PLANKS && planks.get(i) != Material.WARPED_PLANKS) {

				int n = i;
				if(i > 8)
					n = i - 2;
				
				recipes_crafting[13] = new ShapedRecipe(
						new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + boats.get(n).toString().toLowerCase()), 
						new ItemStack(boats.get(n), 1));

				recipes_crafting[13].shape("PSP", "PPP");
				recipes_crafting[13].setIngredient('P', planks.get(i));
				recipes_crafting[13].setIngredient('S', Material.WOODEN_SHOVEL);

				recipes_crafting[14] = new ShapedRecipe(
						new NamespacedKey(KappaVanilla.INSTANCE, "crafting_" + chestboats.get(n).toString().toLowerCase()), 
						new ItemStack(chestboats.get(n), 1));

				recipes_crafting[14].shape(" C ", "PSP", "PPP");
				recipes_crafting[14].setIngredient('P', planks.get(i));
				recipes_crafting[14].setIngredient('C', Material.CHEST);
				recipes_crafting[14].setIngredient('S', Material.WOODEN_SHOVEL);

			}
			
			for(ShapedRecipe recipe : recipes_crafting)
				if(recipe != null)
					cRecipes.add(recipe);
			
			//----------------------------------------------------------------
			// Adding Recipe for stonecutter
			//----------------------------------------------------------------
			StonecuttingRecipe[] recipes_cutting = new StonecuttingRecipe[9];
			
			recipes_cutting[0] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + slabs.get(i)), 
					new ItemStack(slabs.get(i), 2), 
					planks.get(i));
			
			recipes_cutting[1] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + stairs.get(i)), 
					new ItemStack(stairs.get(i), 1), 
					planks.get(i));
			
			recipes_cutting[2] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + doors.get(i)), 
					new ItemStack(doors.get(i), 1), 
					planks.get(i));
			
			recipes_cutting[3] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + trapdoors.get(i)), 
					new ItemStack(trapdoors.get(i), 2), 
					planks.get(i));
			
			recipes_cutting[4] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + pressures.get(i)), 
					new ItemStack(pressures.get(i), 2), 
					planks.get(i));
			
			recipes_cutting[5] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + buttons.get(i)), 
					new ItemStack(buttons.get(i), 2), 
					planks.get(i));
			
			recipes_cutting[6] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + fences.get(i)), 
					new ItemStack(fences.get(i), 1), 
					planks.get(i));
			
			recipes_cutting[7] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + gates.get(i)), 
					new ItemStack(gates.get(i), 1), 
					planks.get(i));
			
			recipes_cutting[8] = new StonecuttingRecipe(
					new NamespacedKey(KappaVanilla.INSTANCE, "cutting_" + planks.get(i) + "_to_stick"), 
					new ItemStack(Material.STICK, 6),
					planks.get(i));
			
			for(StonecuttingRecipe s : recipes_cutting)
				sRecipes.add(s);

		}

	}

	public List<ShapedRecipe> getcRecipes() {
		return cRecipes;
	}

	public List<StonecuttingRecipe> getsRecipes() {
		return sRecipes;
	}
	
}
