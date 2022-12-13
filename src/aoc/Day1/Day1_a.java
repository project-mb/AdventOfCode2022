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
   public List<Elf> createElves(String path) {
      int elfIdx = 0;
      Elf elf = new Elf();
      int next;

      try {
         FileReader fileReader = new FileReader(path);
         int line;

         while ((line = fileReader.read()) != -1){
            next = (char)line;
            //System.out.println("Line: " + next);
            if (next == 0) {
               elf = new Elf();
               elves.add(elf);
               elfIdx++;
            } else {
               elf.addToInventory(new Food(next));
            }
         }
      } catch (FileNotFoundException fnf) {
         System.out.println("Error reading file (" + path + ")");
         System.out.println(fnf);
      } finally {
         return elves;
      }
   }
}
