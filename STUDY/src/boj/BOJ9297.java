package boj;
import java.util.*;

public class BOJ9297 { // Reducing Improper Fractions
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		
		for (int x = 1; x <= t; x++) {
			int n = sc.nextInt(); // the numerator
			int d = sc.nextInt(); // the denominator
			int I = n / d; // the integer part
			int N = n % d; // the numerator of the fractional part
			int D = d; // the denominator of the fractional part
			
			if (I == 0 && N == 0) {
				System.out.println("Case " + x + ": " + 0);
			} else if (I == 0) {
				System.out.println("Case " + x + ": " + N + "/" + D);
			} else if (N == 0) {
				System.out.println("Case " + x + ": " + I);
			} else {
				System.out.println("Case " + x + ": " + I + " " + N + "/" + D);
			}
		}
		
		sc.close();
	}
}