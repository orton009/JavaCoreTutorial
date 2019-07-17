package optum.day1;

public class TestDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayDice p1 = new PlayDice("p1");
		PlayDice p2 = new PlayDice("p2");
		System.out.println("Initially p1 and p2 are in posiiton 1");
		p1.throwDice(p2);
		p2.throwDice(p1);
		p1.throwDice(p2);
		p2.throwDice(p1);
	}

}
