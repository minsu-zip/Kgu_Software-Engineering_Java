package Dice;

public class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public boolean play(Die die1, Die die2) {
		int fv1;
		int fv2;

		die1.roll();
		fv1 = die1.getFaceValue();
		die2.roll();
		fv2 = die2.getFaceValue();

		return ((fv1 + fv2) == 7) ? true : false;
	}
}
