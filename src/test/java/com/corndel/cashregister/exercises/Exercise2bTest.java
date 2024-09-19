package com.corndel.cashregister.exercises;

import static com.corndel.cashregister.exercises.Exercise2b.listNames;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise2bTest {
  @Test
  // Test to ensure correct titles are returned for the given recipes
  void testListNames() {
    List<Recipe> recipes = new ArrayList<>();
    recipes.add(
        new Recipe("Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false));
    recipes.add(
        new Recipe(
            "Vegetable Stir Fry",
            List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
            2,
            true));

    List<String> expectedTitles = List.of("Spaghetti Bolognese", "Vegetable Stir Fry");

    // Check if the function returns the correct list of titles
    assertEquals(expectedTitles, listNames(recipes));
  }

  @Test
  // Test to ensure the function returns an empty list when there are no recipes
  void testEmptyRecipeList() {
    List<Recipe> emptyRecipes = new ArrayList<>();

    // Check if the function returns an empty list
    assertEquals(List.of(), listNames(emptyRecipes));
  }

  @Test
  // Test to ensure correct titles are returned when there is only one recipe
  void testSingleRecipe() {
    List<Recipe> oneRecipe = new ArrayList<>();
    oneRecipe.add(new Recipe("Pancakes", List.of("flour", "milk", "eggs"), 4, true));

    List<String> expectedTitles = List.of("Pancakes");

    // Check if the function returns the correct single title
    assertEquals(expectedTitles, listNames(oneRecipe));
  }

  @Test
  // Test to handle recipes with different properties and ensure correct titles
  // are returned
  void testVariedRecipes() {
    List<Recipe> variedRecipes = new ArrayList<>();
    variedRecipes.add(new Recipe("Salad", List.of("lettuce", "tomatoes"), 2, true));
    variedRecipes.add(new Recipe("Steak", List.of("beef", "seasoning"), 1, false));
    variedRecipes.add(new Recipe("Soup", List.of("broth", "vegetables"), 3, true));

    List<String> expectedTitles = List.of("Salad", "Steak", "Soup");

    // Check if the function returns the correct list of titles for varied recipes
    assertEquals(expectedTitles, listNames(variedRecipes));
  }
}
