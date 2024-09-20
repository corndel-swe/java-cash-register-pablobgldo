package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;

public class Exercise1a {
  /**
   * Accepts a recipe object and returns a summary string as below:
   * 
   * <p>
   * "Spaghetti Bolognese has 3 ingredients and serves 4 people"
   * 
   * <p>
   * "Vegetable Stir Fry has 4 ingredients and serves 2 people"
   * 
   * <p>
   * Note that all fields are public, so recipe.name and recipe.getName() will
   * both work, and which you use is up to your preference.
   */
  public static String getSummary(Recipe recipe) {
    return recipe.name + " has " + recipe.ingredients.size() + " ingredients and serves " + recipe.servings + " people";
  }
}
