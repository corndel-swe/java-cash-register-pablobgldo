package com.corndel.cashregister;

import static com.corndel.cashregister.Level5.transaction;
import static org.assertj.core.api.Assertions.assertThat;

import com.corndel.cashregister.models.Item;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Level5Test {
  @Test
  // Test to ensure the drawer is correctly adjusted after a transaction
  void testTransaction() {
    // Cost of the items in cents (e.g., $8.50)
    int cost = 850;

    // Customer pays with 1 twenty-dollar bill ($20.00)
    List<Item> paid = List.of(
        new Item("twenty", 2000, 1));

    // Initial state of the drawer
    List<Item> drawer = List.of(
        new Item("twenty", 2000, 2),
        new Item("ten", 1000, 2),
        new Item("five", 500, 2),
        new Item("one", 100, 5),
        new Item("quarter", 25, 10),
        new Item("dime", 10, 10),
        new Item("nickel", 5, 10),
        new Item("penny", 1, 50));

    // Expected state of the drawer after the transaction
    List<Item> expectedDrawer = List.of(
        new Item("twenty", 2000, 3), // 2 + 1 (customer paid one twenty)
        new Item("ten", 1000, 1), // 2 - 1 (given as change)
        new Item("five", 500, 2), // unchanged
        new Item("one", 100, 4), // 5 - 1 (given as change)
        new Item("quarter", 25, 8), // 10 - 2 (given as change)
        new Item("dime", 10, 10), // unchanged
        new Item("nickel", 5, 10), // unchanged
        new Item("penny", 1, 50) // unchanged
    );

    // Perform the transaction (the drawer is modified directly)
    var actual = transaction(cost, paid, drawer);

    // Check if the drawer is correctly adjusted
    assertThat(actual).usingRecursiveComparison().isEqualTo(expectedDrawer);
  }

  @Test
  // Test to ensure the drawer is correctly adjusted after a transaction with
  // multiple paid items
  void testTransactionMultiplePaidItems() {
    // Cost of the items in cents (e.g., $15.37)
    int cost = 1537;

    // Customer pays with 1 ten-dollar bill, 1 five-dollar bill, 2 quarters, 1 dime,
    // and 3 pennies
    List<Item> paid = List.of(
        new Item("ten", 1000, 1),
        new Item("five", 500, 1),
        new Item("quarter", 25, 2),
        new Item("dime", 10, 1),
        new Item("penny", 1, 3));

    // Initial state of the drawer
    List<Item> drawer = List.of(
        new Item("twenty", 2000, 1),
        new Item("ten", 1000, 2),
        new Item("five", 500, 3),
        new Item("one", 100, 10),
        new Item("quarter", 25, 4),
        new Item("dime", 10, 5),
        new Item("nickel", 5, 5),
        new Item("penny", 1, 100));

    // Expected state of the drawer after the transaction
    List<Item> expectedDrawer = List.of(
        new Item("twenty", 2000, 1), // unchanged
        new Item("ten", 1000, 3), // 2 + 1 (customer paid one ten)
        new Item("five", 500, 4), // 3 + 1 (customer paid one five)
        new Item("one", 100, 10), // unchanged (no ones given as change)
        new Item("quarter", 25, 5), // 4 + 2 (paid) - 1 (given as change)
        new Item("dime", 10, 6), // 5 + 1 (customer paid one dime)
        new Item("nickel", 5, 5), // unchanged
        new Item("penny", 1, 102) // 100 + 3 (paid) - 1 (given as change)
    );

    // Perform the transaction (the drawer is modified directly)
    var actual = transaction(cost, paid, drawer);

    // Check if the drawer is correctly adjusted
    assertThat(actual).usingRecursiveComparison().isEqualTo(expectedDrawer);
  }
}
