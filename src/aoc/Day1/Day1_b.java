package aoc.Day1;

import aoc.Day;
import aoc.Day1.Model.Elf;
import aoc.Day1.Model.Food;

import java.util.ArrayList;
import java.util.List;

public class Day1_b extends Day {

	// fields
	private final List<Elf> elves;

	// constructors
	public Day1_b() {
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
				elf.getInventoryValue();
				this.elves.add(elf);
				elf = new Elf();
			} else {
				elf.addToInventory(new Food(Integer.parseInt(s)));
			}
		}
	}

	@Override
	public String getAnswer() {
		List<Elf> test = new ArrayList<>(this.elves);
		Elf best;
		int value = 0;

		for (int i = 0; i < 3; i++) {
			best = getBestElf(test);
			value += best.getInventoryValue();
			test.remove(best);
		}

		return String.valueOf(value);
	}

	// class methods
	private Elf getBestElf(List<Elf> list) {
		Elf best = null;

		for (Elf e : list) {
			if (best == null) best = e;
			if (e.compareTo(best) > 0) best = e;
		}

		return best;
	}
}
