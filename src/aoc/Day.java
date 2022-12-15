package aoc;

import java.util.ArrayList;
import java.util.List;

public abstract class Day {

	// fields
	protected String path;
	protected List<String> input;

	// constructors
	public Day() {
		this.path = "src/aoc/";
		this.input = new ArrayList<>();
	}

	// methods
	public String getPath() { return this.path; }
	public List<String> getInput() { return this.input; }

	public abstract void analyzeInput(List<String> input);
	public abstract String getAnswer();
}
