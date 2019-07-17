package optum.day1;

public class PlayDice {
	String name ;
	int place ;
	static int endPoint = 24 ;
	PlayDice(String name){
		this.name=name;
		place=1;
	}
	void throwDice(PlayDice obj) {
		if(place==0) return ;
		int move = (int)(Math.random()*10+1)%7 ;
		System.out.println("player " + name + " scored " + move);
		place+=move;
		if(place == obj.place && place!=1) {
			System.out.println("Game finished as they are in same position " + place); 
			place=0;
			obj.place=0;
		}
		else if (place >= endPoint) {
			System.out.println("Game over nowhere to move");
			place=0;
			obj.place=0;
		}
		else if(move==6) {
			System.out.println("Player " + name + " gets another chance");
			throwDice(obj);
		}
	}
}
