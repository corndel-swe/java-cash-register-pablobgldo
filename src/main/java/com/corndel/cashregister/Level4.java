package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    int remainder = target;
    for (Item item : drawer) {
      if (item.quantity == 0) {
        continue;
      }
      for (int i = 0; i < item.quantity && remainder >= item.value; i++) {
        remainder -= item.value;
      }
      if (remainder == 0) {
        return true;
      }
    }
    return false;
  }
}
