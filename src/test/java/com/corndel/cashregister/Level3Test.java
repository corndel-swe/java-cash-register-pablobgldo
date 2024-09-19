package com.corndel.cashregister;

import static com.corndel.cashregister.Level3.sumDrawer;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.corndel.cashregister.models.Item;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Level3Test {
  @Test
  // Test to ensure the total value of the drawer is correctly calculated and
  // formatted
  void testSumDrawer() {
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

    int expectedSum = 33512;
    // Check if the function returns the correct sum of the drawer
    assertEquals(expectedSum, sumDrawer(drawer));
  }
}
