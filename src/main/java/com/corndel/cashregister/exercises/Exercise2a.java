package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;

import java.sql.SQLOutput;
import java.util.List;

public class Exercise2a {
  /**
   * Given a list of recipes, return the number of vegetarian recipes in the list.
   */
  public static int countVeggies(List<Recipe> recipes) {
    return recipes.stream().filter(x -> x.isVegetarian).toList().size();
  }
}
