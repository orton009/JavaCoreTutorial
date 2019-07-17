package optum.day1;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student() ;
		Student s2 = new Student("xyz" , 11,34,54,65);
		s2.calculatePer();
		s2.display();
		s1.display();
	}
	
}
