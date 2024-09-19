package com.corndel.cashregister.exercises.models;

import java.util.List;

public class Recipe {
  public String name;
  public List<String> ingredients;
  public int servings;
  public boolean isVegetarian;

  public Recipe(String name, List<String> ingredients, int servings, boolean isVegetarian) {
    this.name = name;
    this.ingredients = ingredients;
    this.servings = servings;
    this.isVegetarian = isVegetarian;
  }

  public String getName() {
    return name;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public int getServings() {
    return servings;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public void setServings(int servings) {
    this.servings = servings;
  }

  public boolean isVegetarian() {
    return isVegetarian;
  }

  public void setVegetarian(boolean isVegetarian) {
    this.isVegetarian = isVegetarian;
  }
}
