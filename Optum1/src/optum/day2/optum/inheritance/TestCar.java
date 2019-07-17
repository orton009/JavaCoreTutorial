package optum.day2.optum.inheritance;

public class TestCar {
	public static void main(String[] args) {
		Car c1 = new Car() ;
		c1.start();
		c1.turn();
		c1.move(100);
		c1.move(500);
		c1.stop();
	}
}
