package optum.day3;

public class Demo {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("abcd") ;
		System.out.println("Original String	:	" + s);
		rotate(s , 4);
	}
	static void rotate(StringBuffer s , int n) {
		int len = s.length() ;
		while(n>0) {
			s.insert(len, s.charAt(0));
			s.deleteCharAt(0);
			System.out.println("After rotation	:	" + s);
			n-- ;
		}
	}
}
 