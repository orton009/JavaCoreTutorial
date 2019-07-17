package optum.inheritance;


public class Bus extends FourWheeler{
	public Bus(String company ,int capacity ,  String name, int licenseNo) {
		this.capacity = capacity ;
		this.company = company ;
		driver = new BusDriver(name,licenseNo);
	}
	int capacity ;
	String company;
	BusDriver driver ;
	public void showDetails() {
		System.out.println(company +" bus with " + capacity + " capacity");
		System.out.println("Driver : " + driver.name + " liscno: " + driver.licenseNo);
	}
	public static void main(String[] args) {
		Bus b1 = new Bus("Force" , 60 , "Krishna" , 1023);
		b1.showDetails();
	}
}
