package optum.inheritance;

public class TestCal implements Calculator {
	public void add(int a,int b) {
		
		if(a<=MAX && b<=MAX)
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		new TestCal().add(24,43);
	}

}
