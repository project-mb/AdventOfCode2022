package aoc.Day3.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compartment {

	// fields
	private char[] inventory;
	private List<Character> items;

	// constructors
	public Compartment(char[] inventory) {
		this.inventory = inventory;
		this.items = new ArrayList<>();

		for (char c : inventory) {
			if (!items.contains(c)) items.add(c);
		}
	}

	// getter / setter
	public char[] getInventory() {
		return inventory;
	}
	public void setInventory(char[] inventory) {
		this.inventory = inventory;
	}
	public List<Character> getItems() {
		return items;
	}
	public void setItems(List<Character> items) { this.items = items; }

	// methods
	public void printItems() { System.out.println(items.toString()); }
	public void printInventory() { System.out.println(Arrays.toString(inventory)); }
}
