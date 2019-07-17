import java.util.Scanner ;

class GradeCal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double marks ;
		marks=sc.nextDouble();
		System.out.println("Grade is "+CalGrade(marks)+" for marks "+marks);				
		sc.close();
	}
	static String CalGrade(double marks){
		if(marks<=20){
			return "F" ;
		}
		else if(marks<=40){
			return "D" ;
		}
		else if(marks<=60){
			return "C" ;
		}
		else if(marks<=80){
			return "B" ;
		}
		else{
			return "A" ;
		}	
	}
}