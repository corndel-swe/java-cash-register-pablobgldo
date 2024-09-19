# Contributing

Welcome to the cash register project!

A few things you should know:

- The static methods in `cashregister` are designed to work with a `drawer` full
  of money. Take a look at `Drawer.java` to see what one looks like.

- Currency is in USD: penny, nickel, dime and quarter are coins; everything else
  is a note. These are modeled as `Item` so take a look at `model/Item` to see
  their properties.

- Drawer objects are always ordered descending by value (biggest denomination at
  the front).

- Value is always given as an integer in cents, and never a decimal, so a
  `value` of `210` means $2.10.
  [Want to know why?](https://blog.agentrisk.com/you-better-work-in-cents-not-dollars-2edb52cdf308)

- Debugging! You will probably want to do some `System.out.println` to debug. In
  Level 1, for example, you could add a `main` method like so:

  ```java
  // Level1.java
  public static void main(String[] args) {
    removeItem("penny", Drawer.drawer);

    for (var item : Drawer.drawer) {
      var summary = String.format("%s: %d", item.name, item.quantity);
      System.out.println(summary);
    }
  }
  ```

  then run by clicking "Run" in the editor, or in the terminal like this:

  ```bash
  ./mvnw clean compile exec:java -Dexec.mainClass=com.corndel.cashregister/Level1.java
  ```

  to see what happens.

If you're happy with all this, open up `TODO.md` and have fun!
