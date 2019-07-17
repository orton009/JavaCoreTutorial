package optum.inheritance;

public class Car extends FourWheeler implements Movable {
	int distance=0;
	public Car() {}
	public Car(String company , int price , String color) {
		super(company,price,color);
	}
	public void move(int distance) {
		this.distance += distance ;
		System.out.println("Car has moved " + distance+ " Km and total distance covered is " + this.distance + " Km");
	}
	public void stop() {
		System.out.println("Car has been stopped");
	}
}
