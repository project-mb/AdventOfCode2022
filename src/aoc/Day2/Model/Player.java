package aoc.Day2.Model;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {

	// fields
	private int score;
	private int currMove;
	private final List<Integer> moves;

	// constructors
	public Player() {
		this.score = 0;
		this.moves = new ArrayList<>();
	}

	// methods
	public int getScore() { return this.score; }
	public void setCurrentMove(int round) { this.currMove = this.moves.get(round); }
	public int getCurrMove() { return this.currMove; }
	public List<Integer> getMoves() { return this.moves; }
	public void addScore(int value) { this.score += value; }
	public void addMove(Integer move) { this.moves.add(move); }

	// overrides
	@Override
	public int compareTo(Player o) {

		switch (this.currMove) {
			case 1:
				switch (o.currMove) {
					case 1: return 0;
					case 2: return -1;
					case 3: return 1;
					default: System.out.println("ILikeTrains [Player.compareTo]");
				}
				break;
			case 2:
				switch (o.currMove) {
					case 1: return 1;
					case 2: return 0;
					case 3: return -1;
					default: System.out.println("ILikeTrains [Player.compareTo]");
				}
				break;
			case 3:
				switch (o.currMove) {
					case 1: return -1;
					case 2: return 1;
					case 3: return 0;
					default: System.out.println("ILikeTrains [Player.compareTo]");
				}
				break;
			default: System.out.println("ILikeTrains [Player.compareTo]");
		}
		return 0;
	}
}
