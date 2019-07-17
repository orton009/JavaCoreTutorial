import java.util.*;

public class Test {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("String,,Tokenizer,,example") ;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer("String,,Tokenizer,,example" , ",") ;
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		StringTokenizer st3 = new StringTokenizer("String,,Tokenizer,,example" , "," , true) ;
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}
