package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

import static com.corndel.cashregister.Level1.addItem;
import static com.corndel.cashregister.Level1.removeItem;
import static com.corndel.cashregister.Level3.sumDrawer;
import static com.corndel.cashregister.Level4.canMakeAmount;

public class Level5 {

  /**
   * Calculates the amount of change the customer is owed based on the cost and
   * the amount paid. Adds the customer's paid amount to the drawer, removes their
   * change from the drawer, and then returns the updated drawer.
   * 
   * <p>
   * The paid items must be added to the drawer before removing the appropriate
   * change.
   * 
   * <p>
   * E.g., if the customer pays for $8.50 worth of goods with a $5 and 4 * $1
   * bills, then `paid` will be given as
   * 
   * List.of(new Item("five", 500, 1), new Item("one", 100, 4))
   * 
   * A "five" and a "one" should be added to the drawer, and two "quarters" should
   * be removed as change.
   * 
   * <p>
   * If you want to re-use some functions from other levels, you can do, e.g.
   * Level1.addItem(...) and so on.
   */
  public static List<Item> transaction(int cost, List<Item> paid, List<Item> drawer) {
    // Adds paid money intro drawer
    for (Item item : paid) {
      for (int i = 0; i < item.quantity; i++) {
        addItem(item.name, drawer);
      }
    }
    // Calculates change
    int change = sumDrawer(paid) - cost;

    // Removes change from drawer and returns it
    for (Item item : drawer) {
      if (item.quantity == 0) {
        continue;
      }
      while (change >= item.value) {
        change -= item.value;
        removeItem(item.name, drawer);
      }
      if (change == 0) {
        return drawer;
      }
    }
    return null;
  }
}
