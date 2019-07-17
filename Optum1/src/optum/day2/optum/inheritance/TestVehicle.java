package optum.day2.optum.inheritance;

public class TestVehicle {
	public static void main(String[] args) {
		TwoWheeler t2 = new TwoWheeler("Tvs" , 60000) ;
		test(t2);
		test(new FourWheeler("Audi" , 6000000 , "White")) ;
	}
	public static void test(Vehicle obj){
		System.out.println("Company = " + obj.getCompany() );
		
		if (obj instanceof TwoWheeler)		//identifies the type of object at runtime
			System.out.println("Price = " + ((TwoWheeler)obj).getPrice());
		
		else if(obj instanceof FourWheeler)
			System.out.println("Price = " + ((FourWheeler)obj).getPrice() + " color = " + ((FourWheeler)obj).getColor());
	}
}
