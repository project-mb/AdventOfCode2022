package aoc;

public abstract class Item {
   private int value;

   public Item() { this.value = 0; }
   public Item(int value) { this.value = value; }

   public int getValue() { return value; }
}
