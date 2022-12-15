package aoc.Day2;

import aoc.Day;
import aoc.Day2.Model.Player;
import aoc.Day2.Model.RockPaperScissors;

import java.util.List;

public class Day2_a extends Day {

	private final Player a;
	private final Player z;

	// constructors
	public Day2_a() {
		super();
		this.path += String.format("%.4s/", this.getClass().getSimpleName());
		this.a = new Player();
		this.z = new Player();
	}

	// methods
	@Override
	public void analyzeInput(List<String> input) {
		String[] arr;
		this.input = input;

		for (String s : this.input) {
			if (s.equals("")) break;

			arr = s.split(" ");

			switch (arr[0].charAt(0)) {
				case 'A' -> a.addMove(1);
				case 'B' -> a.addMove(2);
				case 'C' -> a.addMove(3);
			}

			switch (arr[1].charAt(0)) {
				case 'X' -> z.addMove(1);
				case 'Y' -> z.addMove(2);
				case 'Z' -> z.addMove(3);
			}
		}
	}

	@Override
	public String getAnswer(){
		RockPaperScissors game = new RockPaperScissors(a, z);

		for (int i = 0; i < this.input.size() - 1; i++) {
			a.setCurrentMove(i);
			z.setCurrentMove(i);
			game.play();

			//System.out.println("game " + i + " / " + (this.input.size() - 1) + ": " + a.getCurrMove() + ":" + z.getCurrMove() + " = " + a.getScore() + "/" + z.getScore());
		}

		return String.valueOf(z.getScore());
	}
}
