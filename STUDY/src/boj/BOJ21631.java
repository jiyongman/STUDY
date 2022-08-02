package boj;
import java.util.*;

public class BOJ21631 { // Checkers
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); // the number of white stripe stripes
		long b = sc.nextLong(); // the number of black stripe stripes
		
		if (a >= b) {
			System.out.println(b);
		} else {
			System.out.println(a + 1);
		}
		
		sc.close();
	}
}