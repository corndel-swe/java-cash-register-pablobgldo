package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;

public class Exercise2a {
  /**
   * Given a list of recipes, return the number of vegetarian recipes in the list.
   */
  public static int countVeggies(List<Recipe> recipes) {
    var count = 0;

    for (var recipe : recipes) {
      if (recipe.isVegetarian) {
        count++;
      }
    }

    return count;
  }
}
