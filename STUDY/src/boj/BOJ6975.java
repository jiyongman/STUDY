package boj;
import java.util.*;

public class BOJ6975 { // Deficient, Perfect, and Abundant

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of integers
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int sum = 0;
			
			for (int j = 1; j < n; j++) {
				if (n % j == 0) {
					sum += j;
				}
			}
			
			if (n > sum) {
				System.out.println(n + " is a deficient number.");
			} else if (n < sum) {
				System.out.println(n + " is an abundant number.");
			} else {
				System.out.println(n +  " is a perfect number.");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}