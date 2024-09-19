package com.corndel.cashregister.exercises;

import static com.corndel.cashregister.exercises.Exercise3a.lastRecipe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise3aTest {
  @Test
  // Test to ensure the title of the last recipe is returned
  void testLastRecipeTitle() {
    List<Recipe> recipes = new ArrayList<>();
    recipes.add(
        new Recipe("Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false));
    recipes.add(
        new Recipe(
            "Vegetable Stir Fry",
            List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
            2,
            true));

    RecipeBook recipeBook = new RecipeBook("My Recipe Book", recipes);

    String expectedTitle = "Vegetable Stir Fry";
    // Check if the function returns the correct title
    assertEquals(expectedTitle, lastRecipe(recipeBook).getName());
  }

  @Test
  // Test to ensure the function returns null when there are no recipes
  void testNoRecipes() {
    RecipeBook emptyRecipeBook = new RecipeBook("Empty Recipe Book", new ArrayList<>());

    // Check if the function returns null
    assertNull(lastRecipe(emptyRecipeBook));
  }

  @Test
  // Test to ensure the title is returned correctly when there is only one recipe
  void testSingleRecipe() {
    List<Recipe> oneRecipe = new ArrayList<>();
    oneRecipe.add(new Recipe("Pancakes", List.of("flour", "milk", "eggs"), 4, true));

    RecipeBook oneRecipeBook = new RecipeBook("Single Recipe Book", oneRecipe);

    String expectedTitle = "Pancakes";
    // Check if the function returns the correct title
    assertEquals(expectedTitle, lastRecipe(oneRecipeBook).getName());
  }
}
