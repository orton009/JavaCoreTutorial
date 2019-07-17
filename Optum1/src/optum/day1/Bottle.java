package optum.day1;

public class Bottle {
	final int maxCapacity ;
	int curCapacity ;
	boolean isOpen ;
	Bottle(int capacity){
		maxCapacity = capacity ;
		curCapacity=capacity;
		isOpen=false;
	}
	void fill(int amount) {
		if(isOpen && curCapacity>=amount) {
			System.out.println("Bottle is filled "+ amount+" ml");
			curCapacity-=amount ;
		}
		else if(!isOpen)
			System.out.println("Bottle is closed");
		else System.out.println("Bottle is full");
	}
	void open() {
		isOpen=true ;
		System.out.println("Bottle is Opened"); 
	}
}
