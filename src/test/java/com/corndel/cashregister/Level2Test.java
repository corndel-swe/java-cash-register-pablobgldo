package com.corndel.cashregister;

import static com.corndel.cashregister.Level2.countCoins;
import static com.corndel.cashregister.Level2.countNotes;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.models.Item;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Level2Test {
  @Test
  // Test to ensure the total number of coins is counted correctly
  void testCountCoins() {
    List<Item> drawer = List.of(
        new Item("hundred", 10000, 1),
        new Item("twenty", 2000, 3),
        new Item("ten", 1000, 2),
        new Item("five", 500, 11),
        new Item("one", 100, 90),
        new Item("quarter", 25, 17),
        new Item("dime", 10, 31),
        new Item("nickel", 5, 41),
        new Item("penny", 1, 72));

    int expectedCoinCount = 161;
    // Check if the function correctly counts the total number of coins
    assertEquals(expectedCoinCount, countCoins(drawer));
  }

  @Test
  // Test to ensure the total number of notes is counted correctly
  void testCountNotes() {
    List<Item> drawer = List.of(
        new Item("hundred", 10000, 1),
        new Item("twenty", 2000, 3),
        new Item("ten", 1000, 2),
        new Item("five", 500, 11),
        new Item("one", 100, 90),
        new Item("quarter", 25, 17),
        new Item("dime", 10, 31),
        new Item("nickel", 5, 41),
        new Item("penny", 1, 72));

    int expectedNoteCount = 107;
    // Check if the function correctly counts the total number of notes
    assertEquals(expectedNoteCount, countNotes(drawer));
  }
}
