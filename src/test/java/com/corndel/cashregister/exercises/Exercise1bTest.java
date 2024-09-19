package com.corndel.cashregister.exercises;

import static com.corndel.cashregister.exercises.Exercise1b.renameBook;
import static org.assertj.core.api.Assertions.assertThat;

import com.corndel.cashregister.exercises.models.RecipeBook;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class Exercise1bTest {
  @Test
  // Test for renaming the recipe book
  void testRenameBook() {
    RecipeBook recipeBook = new RecipeBook("My Recipe Book", new ArrayList<>());

    String newName = "Good Eats";
    RecipeBook expectedBook = new RecipeBook(newName, new ArrayList<>());

    // Check if the book is renamed correctly
    assertThat(renameBook(recipeBook, newName)).usingRecursiveComparison().isEqualTo(expectedBook);
  }
}
