package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercise3b {
  /**
   * Given a recipeBook containing recipes, returns the total number of servings
   * in the book
   */
  public static int countServings(RecipeBook recipeBook) {
    int total = 0;
    for (Recipe x: recipeBook.recipes) {
        total+= x.servings;
    };
    return total;
  }
}
