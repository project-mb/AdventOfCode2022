package aoc.Day1;

import aoc.Elf;
import aoc.Food;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1_a {

   // fields
   private List<String> input;
   private List<Elf> elves;

   // constructors
   public Day1_a(List<String> input) {
      this.input = input;
      this.elves = new ArrayList<>(0);
   }

   // methods
   public List<Elf> analyzeInput() {
      int elfIdx = 0;
      Elf elf = new Elf();
      int line;

      for (int i = 0; i < input.size(); i++) {
         if (input.get(i) == "") {
            elf = new Elf();
            elves.add(elf);
            elfIdx++;
         } else {
            elf.addToInventory(new Food(Integer.parseInt(input.get(i))));
         }
      }

      return null;
   }
}
