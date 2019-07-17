package optum.day1;

public class Student {
	String name ;
	int rollno ;
	int physics , chem , math ;
	int marks[] ;
	float per;
	public Student(String name, int rollno, int physics, int chem, int math) {
		//super();
		System.out.println("Student() - par Constructor");
		this.name = name;
		this.rollno = rollno;
		this.physics = physics;
		this.chem = chem;
		this.math = math;
	}
	public Student(){ //default constructor
		System.out.println("Student() - default constructor");
		this.name="abc" ;
		rollno=10;
		physics=80;
		chem=40;
		math=75;
		marks = new int[] {10,20,30} ;		//This is the only way to define array elements at one go
	}
	void calculatePer() {
		//Calculates percentage
		per = (physics+math+chem)/3f ;
	}
	void display() {
		System.out.println("Percentage of " +name+ " is "+per + " and Grade is " + calculateGrade());
	}
	String calculateGrade() {
		if(per>=80)
				return "Distinction" ;
		else if(per<=80 && per>=60)
				return "Pass" ;
		else return "Fail" ;
	}
}
