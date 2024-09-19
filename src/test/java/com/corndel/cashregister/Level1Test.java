package com.corndel.cashregister;

import static com.corndel.cashregister.Level1.addItem;
import static com.corndel.cashregister.Level1.removeItem;
import static org.assertj.core.api.Assertions.assertThat;

import com.corndel.cashregister.models.Item;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Level1Test {
  @Test
  // Test to ensure the quantity of a penny is reduced by 1
  void testRemoveItem() {
    List<Item> drawer = List.of(new Item("penny", 1, 5));

    List<Item> testDrawer = removeItem("penny", drawer);
    List<Item> expectedDrawer = List.of(new Item("penny", 1, 4));

    // Check if the function correctly removes an item
    assertThat(testDrawer).usingRecursiveComparison().isEqualTo(expectedDrawer);
  }

  @Test
  // Test to ensure the quantity of a penny is increased by 1
  void testAddItem() {
    List<Item> drawer = List.of(new Item("penny", 1, 5));

    List<Item> testDrawer = addItem("penny", drawer);
    List<Item> expectedDrawer = List.of(new Item("penny", 1, 6));

    // Check if the function correctly adds an item
    assertThat(testDrawer).usingRecursiveComparison().isEqualTo(expectedDrawer);
  }
}
