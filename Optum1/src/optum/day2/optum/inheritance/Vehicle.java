package optum.day2.optum.inheritance ;

public class Vehicle {
	@Override
	public String toString() {
		return "Vehicle [Company=" + Company + "]";
	}
	private String Company ;
	
	public Vehicle(){	}
	
	public Vehicle(String company) {
		this.Company = company ;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}
	
	void start() {
		System.out.println("Vehicle has started.......");
	}
	void turn() {
		System.out.println("Vehicle...... Turning");
	}
	
}
