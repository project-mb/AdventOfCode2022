package aoc.Day3;

import aoc.Day;
import aoc.Day3.Model.Priority;
import aoc.Day3.Model.Rucksack;

import java.util.ArrayList;
import java.util.List;

public class Day3_a extends Day {

	// fields
	private final List<Rucksack> rucksacks;

	//constructors
	public Day3_a() {
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

		int sum = 0;

		for (Rucksack r : rucksacks) {
			sum += Priority.priorityMap.get(r.findDuplicates().get(0));
		}

		return String.valueOf(sum);
	}
}
