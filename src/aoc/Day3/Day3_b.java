package aoc.Day3;

import aoc.Day;
import aoc.Day3.Model.Priority;
import aoc.Day3.Model.Rucksack;

import java.util.ArrayList;
import java.util.List;

public class Day3_b extends Day {

	// fields
	private final List<Rucksack> rucksacks;

	//constructors
	public Day3_b() {
		super();
		this.path += String.format("%.4s/", this.getClass().getSimpleName());
		this.rucksacks = new ArrayList<>();
	}

	// overrides
	@Override
	public void analyzeInput(List<String> input) {
		this.input = input;

		for (int i = 0; i < input.size() - 1; i++) {
			this.rucksacks.add(new Rucksack(input.get(i).toCharArray()));
		}
	}
	@Override
	public String getAnswer() {
		//this.rucksacks.get(0).printInventory();
		List<Character> temp;
		List<Character> dupes;

		int sum = 0;

		for (int i = 0; i < rucksacks.size(); i += 3) {
			temp = new ArrayList<>();
			dupes = new ArrayList<>();

			for (char c : rucksacks.get(i).getItems()) {
				if (!temp.contains(c) && rucksacks.get(i + 1).getItems().contains(c)) temp.add(c);
			}
			for (char c : temp) {
				if (!dupes.contains(c) && rucksacks.get(i + 2).getItems().contains(c)) dupes.add(c);
			}

			sum += Priority.priorityMap.get(dupes.get(0));
		}

		return String.valueOf(sum);
	}
}
