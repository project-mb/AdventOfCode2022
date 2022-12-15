package aoc.Day2.Model;

public class RockPaperScissors {

	// fields
	private final Player a;
	private final Player z;

	// constructors
	public RockPaperScissors(Player a, Player z) {
		this.a = a;
		this.z = z;
	}

	// methods
	public void play() {
		int aMove = a.getCurrMove();
		int zMove = z.getCurrMove();

		if(a.compareTo(z) > 0){
			a.addScore(6 + aMove);
			z.addScore(zMove);
		} else if (a.compareTo(z) < 0){
			a.addScore(aMove);
			z.addScore(6 + zMove);
		} else {
			a.addScore(3 + aMove);
			z.addScore(3 + zMove);
		}
	}
}
