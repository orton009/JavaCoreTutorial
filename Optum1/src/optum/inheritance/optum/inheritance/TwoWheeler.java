package optum.inheritance;

public class TwoWheeler extends Vehicle {
	@Override
	public String toString() {
		return super.toString()+"TwoWheeler [price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("TwoWheeler Equals()");
		boolean result=false;
		result=this.getCompany().contentEquals(((TwoWheeler)obj).getCompany());
		result=result&&(this.price==((TwoWheeler)obj).price);
		return result;
	}
	private int price ;
	
	TwoWheeler(){}
	
	TwoWheeler(String co, int price){
		//super.setCompany(co);
		super(co);
		this.price = price ;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	void turn() {
		System.out.println("TwoWheeler...... Turning");
	}
}
