package boj;
import java.util.*;

public class BOJ9299 { // Math Tutoring
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		
		for (int x = 1; x <= t; x++) {
			int n = sc.nextInt(); // the highest exponent of the polynomial
			int[] a = new int[n + 1];
			int k = n;
			
			System.out.print("Case " + x + ": " + (n - 1) + " ");
			
			for (int y = 0; y < n + 1; y++) {
				a[y] = sc.nextInt(); // the coefficients of the terms x^n down to x^0 = 1
			}
			
			for (int y = 0; y < n; y++) {
				a[y] *= k;
				System.out.print(a[y] + " ");
				k--;
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}