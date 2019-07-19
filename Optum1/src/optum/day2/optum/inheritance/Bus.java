package optum.day2.optum.inheritance;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Bus extends FourWheeler{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Bus(String company ,int capacity ,  String name, int licenseNo) {
		this.capacity = capacity ;
		this.company = company ;
		driver = new BusDriver(name,licenseNo);
		//people = new HashSet<String>();
		//people.addAll(Arrays.asList("ram" , "shyam" , "ram" , "govind" , "vishnu"));
		people = new TreeSet<People>();
	}
	int capacity ;
	String company;
	BusDriver driver ;
	//Set<String> people;
	Set<People> people;
	@SuppressWarnings("deprecation")
	public void addPeople(String nm , Date join) {
		if(join.after(new Date(2019,7,1))) {
			people.add(new People(nm,join));
		}
		else {
			System.out.println("Invalid date");
		}
	}
	public void showDetails() {
		System.out.println(company +" bus with " + capacity + " capacity");
		System.out.println("Driver : " + driver.name + " liscno: " + driver.licenseNo);
		System.out.println("Persons in the Bus : " + people.toString());
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Bus b1 = new Bus("Force" , 60 , "Krishna" , 1023);
		b1.addPeople("tom", new Date(2019,8,1));
		b1.addPeople("Ram", new Date(2019,8,1));
		b1.addPeople("Shyam", new Date(2019,8,1));
		b1.showDetails();
	}
}
