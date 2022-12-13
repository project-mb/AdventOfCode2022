package aoc;

import aoc.Day1.Day1_a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

   public static List<String> readFile(String path) {
      List<String> list = null;
      try {
         list = Files.readAllLines(Path.of(path));
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
      for (String s : list) {
         System.out.println(s);
      }

      return list;
   }

   public static void main(String[] args) {


      List<Elf> elves;

      Day1_a day = new Day1_a(readFile("src/aoc/Day1/Example.txt"));
      elves = day.createElves("src/aoc/Day1/Example.txt");

      for (Elf e : elves) {
         for (Item i : e.getInventory()) {
            System.out.println(i.getValue());
         }
         System.out.println(e.getInventoryScore() + System.lineSeparator());
      }

   }
}
