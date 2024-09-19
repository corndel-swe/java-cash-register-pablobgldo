package com.corndel.cashregister.exercises.models;

import java.util.List;

public class RecipeBook {
  public String title;
  public List<Recipe> recipes;

  public RecipeBook(String title, List<Recipe> recipes) {
    this.title = title;
    this.recipes = recipes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Recipe> getRecipes() {
    return recipes;
  }

  public void setRecipes(List<Recipe> recipes) {
    this.recipes = recipes;
  }
}
