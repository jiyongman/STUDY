package boj;
import java.util.*;

public class BOJ11131 { // Balancing Weights
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // the number of weights in the test case
			int sum = 0;
			
			for (int j = 0; j < N; j++) {
				int Wi = sc.nextInt(); // the locations of the N weights
				sum += Wi;
			}
			
			if (sum > 0) {
				System.out.println("Right");
			} else if (sum < 0) {
				System.out.println("Left");
			} else {
				System.out.println("Equilibrium");
			}
		}
		
		sc.close();
	}
}