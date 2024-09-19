package com.corndel.cashregister.exercises;

import static com.corndel.cashregister.exercises.Exercise3b.countServings;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise3bTest {

  @Test
  // Test to ensure the total number of servings is correctly counted
  void testTotalServings() {
    List<Recipe> recipes = List.of(
        new Recipe(
            "Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false),
        new Recipe(
            "Vegetable Stir Fry",
            List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
            2,
            true));

    RecipeBook recipeBook = new RecipeBook("My Recipe Book", recipes);

    int expectedServings = 6;
    // Check if the function returns the correct total number of servings
    assertEquals(expectedServings, countServings(recipeBook));
  }

  @Test
  // Test to ensure the function returns 0 when there are no recipes
  void testNoRecipes() {
    RecipeBook emptyRecipeBook = new RecipeBook("Empty Recipe Book", new ArrayList<>());

    // Check if the function returns 0 when there are no recipes
    assertEquals(0, countServings(emptyRecipeBook));
  }

  @Test
  // Test to ensure the correct number of servings is returned when there is only
  // one recipe
  void testSingleRecipe() {
    List<Recipe> oneRecipe = List.of(new Recipe("Pancakes", List.of("flour", "milk", "eggs"), 4, true));

    RecipeBook oneRecipeBook = new RecipeBook("Single Recipe Book", oneRecipe);

    int expectedServings = 4;
    // Check if the function returns the correct number of servings
    assertEquals(expectedServings, countServings(oneRecipeBook));
  }

  @Test
  // Test to ensure the correct number of servings is returned with multiple
  // recipes
  void testMultipleRecipes() {
    List<Recipe> multipleRecipes = List.of(
        new Recipe("Salad", List.of("lettuce", "tomatoes"), 2, true),
        new Recipe("Steak", List.of("beef", "seasoning"), 3, false),
        new Recipe("Soup", List.of("broth", "vegetables"), 4, true));

    RecipeBook multipleRecipesBook = new RecipeBook("Multiple Recipes Book", multipleRecipes);

    int expectedServings = 9;
    // Check if the function returns the correct total number of servings
    assertEquals(expectedServings, countServings(multipleRecipesBook));
  }
}
