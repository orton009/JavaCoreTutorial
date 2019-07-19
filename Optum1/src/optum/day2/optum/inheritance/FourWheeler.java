package optum.day2.optum.inheritance;

import java.io.Serializable;

public class FourWheeler extends Vehicle implements Serializable{
	private int price ;
	private String color;
	
	public FourWheeler() {}
	public FourWheeler(String Company , int price , String color) {
		super(Company);
		this.price= price;
		this.color = color ;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color ;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void turn() {
		System.out.println("Four Wheeler..... turning ");
	}
}
