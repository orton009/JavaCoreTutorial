package optum.day2.optum.inheritance;

import java.io.Serializable;

public class Car extends FourWheeler implements Movable , Serializable {
	int distance=0;
	public Car() {}
	public Car(String company , int price , String color) {
		super(company,price,color);
	}
	
	@Override
	public String toString() {
		return "Car [getColor()=" + getColor() + ", getPrice()=" + getPrice() + ", getCompany()=" + getCompany() + "]";
	}
	public void move(int distance) {
		this.distance += distance ;
		System.out.println("Car has moved " + distance+ " Km and total distance covered is " + this.distance + " Km");
	}
	public void stop() {
		System.out.println("Car has been stopped");
	}
}
