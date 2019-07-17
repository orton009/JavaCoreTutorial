//import java.util.Scanner;
import optum.day1.*;

public class Hello {

	public static void main(String[] args) {
		int n=3;
		System.out.println("n = " + n);
		double sum=0 ;
		for(int i=1;i<=n;i++) {
			double f=Factorial.factorial(i);
			System.out.println("factorial of "+i+" is " + f);
			sum+=f;
		}
		System.out.println("Sum of facts= " + sum);
		/*
		 	for (String s : args){
		 	}
		 */
	}
	
}
