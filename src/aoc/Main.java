package aoc;

import aoc.Day1.Day1_b;
import aoc.Day2.Day2_a;
import aoc.Day2.Day2_b;
import aoc.Day3.Day3_a;
import aoc.Day3.Day3_b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

	// static
	private static final String examplePath = "Example.txt";
	private static final String inputPath = "Input.txt";

	public static List<String> readFile(String path) {
		List<String> list;
		try {
			list = Files.readAllLines(Path.of(path));
			list.add("");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// print input
		if (path.contains("Example.txt")) {
			for (String s : list) {
				System.out.println(s);
			}
			System.out.println("##########" + System.lineSeparator());
		}

		return list;
	}

	public static void main(String[] args) {
		Day day = new Day3_b();
		day.analyzeInput(readFile(day.getPath() + inputPath));
		System.out.println("The answer is: " + System.lineSeparator() + day.getAnswer());
	}
}
