package boj;
import java.util.*;

public class BOJ10693 { // Abdelrahman
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int n = 1; n <= T; n++) {
			int N = sc.nextInt(); // the number of computers in the contest hall
			int M = sc.nextInt(); // the number of cables in the contest hall
			int R = M - (N - 1); //  the maximum number of cables that can be removed
			
			System.out.println("Case " + n + ": " + R);
		}
		
		sc.close();
	}
}