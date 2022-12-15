package aoc.Day3.Model;

import java.util.ArrayList;
import java.util.List;

public class Rucksack {

	// fields
	private final char[] inventory;
	private final List<Character> items;
	private final Compartment left;
	private final Compartment right;

	// constructors
	public Rucksack(char[] items) {
		this.inventory = items;
		this.items = new ArrayList<>();

		char[] l = new char[items.length / 2];
		char[] r = new char[items.length / 2];

		for (int i = 0; i < items.length; i++) {
			if (!this.items.contains(items[i])) this.items.add(items[i]);

			if (i < items.length / 2) {
				l[i] = items[i];
			} else {
				r[i - (items.length / 2)] = items[i];
			}
		}

		this.left = new Compartment(l);
		this.right = new Compartment(r);
	}

	// getter / setter
	public List<Character> getItems() { return this.items; }

	// methods
	public List<Character> findDuplicates() {
		List<Character> dupes = new ArrayList<>();

		for (char c : left.getItems()) {
			if (right.getItems().contains(c) && !dupes.contains(c)) dupes.add(c);
		}

		return dupes;
	}

	public void printInventory() {
		System.out.println("Left " + left.getInventory().length + ":");
		left.printInventory();
		left.printItems();
		System.out.println("Right " + right.getInventory().length + ":");
		right.printInventory();
		right.printItems();
		System.out.println("Dupes " + findDuplicates().toString());
	}
}
