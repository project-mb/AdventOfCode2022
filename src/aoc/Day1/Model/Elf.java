package aoc.Day1.Model;

import aoc.Item;

import java.util.ArrayList;
import java.util.List;

public class Elf implements Comparable<Elf> {

  // static
  private static int count;

  // fields
  private int inventoryValue;
  private final List<Item> inventory;

  // constructors
  public Elf() {
    count++;
    this.inventoryValue = 0;
    this.inventory = new ArrayList<>();
  }

  // methods
  public static int getCount() { return count; }
  public List<Item> getInventory() { return this.inventory; }
  public void addToInventory(Food food) { this.inventory.add(food); }

  public int getInventoryValue() {
    this.inventoryValue = 0;
    Food food;

    for (Item i : this.inventory) {
      food = (Food) i;
      this.inventoryValue += food.getValue();
    }

    return this.inventoryValue;
  }

  public void printInventory(){
      for (Item i : this.getInventory()) {
        System.out.println(i.getValue());
      }
      System.out.println("= " + this.getInventoryValue() + System.lineSeparator());
  }

  // overrides
  @Override
  public int compareTo(Elf o) {
    return Integer.compare(this.inventoryValue, o.inventoryValue);
  }
}
