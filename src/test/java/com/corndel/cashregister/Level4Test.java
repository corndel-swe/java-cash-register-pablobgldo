package com.corndel.cashregister;

import static com.corndel.cashregister.Level4.canMakeAmount;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.models.Item;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Level4Test {
  @Test
  // Test to ensure the function returns false when the amount cannot be made
  void testCannotMakeAmount() {
    List<Item> drawer = List.of(
        new Item("ten", 1000, 1),
        new Item("five", 500, 1),
        new Item("one", 100, 2),
        new Item("quarter", 25, 3),
        new Item("dime", 10, 0),
        new Item("nickel", 5, 0),
        new Item("penny", 1, 2));

    // Check if the function returns false when the amount cannot be made
    assertEquals(false, canMakeAmount(613, drawer));
  }

  @Test
  // Test to ensure the function returns true when the amount can be made
  void testCanMakeAmount() {
    List<Item> drawer = List.of(
        new Item("ten", 1000, 1),
        new Item("five", 500, 1),
        new Item("one", 100, 2),
        new Item("quarter", 25, 3),
        new Item("dime", 10, 0),
        new Item("nickel", 5, 0),
        new Item("penny", 1, 2));

    // Check if the function returns true when the amount can be made
    assertEquals(true, canMakeAmount(1651, drawer));
  }
}
