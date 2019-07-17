package optum.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("output is " + factorial(num));
		sc.close();
	}
	public static double factorial(int num) {
		double res=1;
		while(num>1) {
			res=res*num;
			num-- ;
		}
		return res;
	}

}
