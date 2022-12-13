package aoc;

import java.util.ArrayList;
import java.util.List;

public class Elf {

   // fields
   private List<Item> inventory;

   // constructors
   public Elf() { this.inventory = new ArrayList<>(); }

   // methods
   public List<Item> getInventory() { return this.inventory; }
   public void addToInventory(Food food) { this.inventory.add(food); }

   public int getInventoryScore() {
      int score = 0;
      Food food;

      for (Item i : this.inventory) {
         food = (Food) i;
         score += food.getValue();
      }

      return score;
   }
}
