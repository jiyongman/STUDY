package boj;
import java.util.*;

public class BOJ16427 { // Time Limits
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of solutions from judges
		int s = sc.nextInt(); // the multiplying factor
		int max = 1;
		int t = 0; // // the time limit to set for this problem
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt(); // the number of milliseconds it takes for some judge’s solution to run in the contest environment
			max = Math.max(max, m);
			
			if (s * max % 1000 == 0) {
				t = s * max / 1000;
			} else {
				t = s * max / 1000 + 1;
			}
		}
		
		System.out.println(t);
		sc.close();
	}
}