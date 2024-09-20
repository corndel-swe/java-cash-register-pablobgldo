package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level2 {
  /**
   * Goes through the given drawer and counts how many *coins* there are in total
   * 
   * <p>
   * N.b. just the number of coins, not the total value of them
   * 
   * <p>
   * N.b. $1 is a note, not a coin
   */
  public static int countCoins(List<Item> drawer) {
    return drawer.stream().filter(x -> drawer.indexOf(x) > 4).map(x->x.quantity).reduce(0, Integer::sum);
  }

  /**
   * Same as count coins but for *notes* instead
   */
  public static int countNotes(List<Item> drawer) {
    return drawer.stream().filter(x -> drawer.indexOf(x) < 5).map(x->x.quantity).reduce(0, Integer::sum);
  }
  }
