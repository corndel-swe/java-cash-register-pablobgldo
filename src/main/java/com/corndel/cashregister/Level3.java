package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level3 {
  /**
   * Calculates the total value of all money in the drawer.
   */
  public static int sumDrawer(List<Item> drawer) {
    return drawer.stream().map(x->x.quantity*x.value).reduce(0, Integer::sum);
  }
}
