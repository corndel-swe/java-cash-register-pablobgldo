package com.corndel.cashregister.exercises;

import static com.corndel.cashregister.exercises.Exercise1a.getSummary;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise1aTest {
  // Sample recipes for testing
  Recipe recipe1 = new Recipe("Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false);

  Recipe recipe2 = new Recipe(
      "Vegetable Stir Fry",
      List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
      2,
      true);

  @Test
  // Test for Spaghetti Bolognese
  void testSpaghettiBologneseSummary() {
    String expectedSummary = "Spaghetti Bolognese has 3 ingredients and serves 4 people";
    // Check if the generated summary matches the expected summary
    assertEquals(expectedSummary, getSummary(recipe1));
  }

  @Test
  // Test for Vegetable Stir Fry
  void testVegetableStirFrySummary() {
    String expectedSummary = "Vegetable Stir Fry has 4 ingredients and serves 2 people";
    // Check if the generated summary matches the expected summary
    assertEquals(expectedSummary, getSummary(recipe2));
  }
}
