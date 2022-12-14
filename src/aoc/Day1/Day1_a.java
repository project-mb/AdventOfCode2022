package aoc.Day1;

import aoc.Day;
import aoc.Day1.Model.Elf;
import aoc.Day1.Model.Food;

import java.util.ArrayList;
import java.util.List;

public class Day1_a extends Day {

	// fields
	private final List<Elf> elves;

	// constructors
	public Day1_a() {
		super();
		this.path += String.format("%.4s/", this.getClass().getSimpleName());
		this.elves = new ArrayList<>();
	}

	// methods
	@Override
	public void analyzeInput(List<String> input) {
		Elf elf = new Elf();
		this.input = input;

		for (String s : this.input) {
			if (s.equals("")) {
				this.elves.add(elf);
				elf = new Elf();
			} else {
				elf.addToInventory(new Food(Integer.parseInt(s)));
			}
		}
	}

	@Override
	public String getAnswer() {
		int current;
		int maxValue = 0;

		for (Elf e : this.elves) {
			current = e.getInventoryValue();
			if (current > maxValue) maxValue = current;
		}

		return String.valueOf(maxValue);
	}
}
