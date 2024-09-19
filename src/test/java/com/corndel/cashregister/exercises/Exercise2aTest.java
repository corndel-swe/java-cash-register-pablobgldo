package com.corndel.cashregister.exercises;

import static com.corndel.cashregister.exercises.Exercise2a.countVeggies;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise2aTest {
  @Test
  // Test for counting vegetarian recipes
  void testCountVeggies() {
    List<Recipe> recipes = new ArrayList<>();
    recipes.add(
        new Recipe("Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false));
    recipes.add(
        new Recipe(
            "Vegetable Stir Fry",
            List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
            2,
            true));

    // Filter recipes to get only vegetarian ones
    long vegetarianRecipesCount = recipes.stream().filter(recipe -> recipe.isVegetarian()).count();
    // Check if the count matches the expected number
    assertEquals(vegetarianRecipesCount, countVeggies(recipes));
  }

  @Test
  // Test when there are no vegetarian recipes
  void testNoVegetarianRecipes() {
    List<Recipe> noVegetarianRecipes = new ArrayList<>();
    noVegetarianRecipes.add(
        new Recipe("Chicken Curry", List.of("chicken", "curry sauce"), 4, false));
    noVegetarianRecipes.add(new Recipe("Beef Stew", List.of("beef", "potatoes"), 6, false));

    // Check if the count is 0 when no vegetarian recipes are present
    assertEquals(0, countVeggies(noVegetarianRecipes));
  }

  @Test
  // Test when all recipes are vegetarian
  void testAllVegetarianRecipes() {
    List<Recipe> allVegetarianRecipes = new ArrayList<>();
    allVegetarianRecipes.add(
        new Recipe("Vegetarian Salad", List.of("lettuce", "tomatoes"), 2, true));
    allVegetarianRecipes.add(
        new Recipe("Vegetarian Burger", List.of("bun", "veggie patty"), 1, true));

    // Check if the count matches the total number of recipes
    assertEquals(allVegetarianRecipes.size(), countVeggies(allVegetarianRecipes));
  }

  @Test
  // Test handling of an empty list of recipes
  void testEmptyRecipeList() {
    List<Recipe> emptyRecipes = new ArrayList<>();

    // Check if the count is 0 for an empty list
    assertEquals(0, countVeggies(emptyRecipes));
  }
}
