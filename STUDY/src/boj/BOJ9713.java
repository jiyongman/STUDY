package boj;
import java.util.*;

public class BOJ9713 { // Sum of Odd Sequence
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // odd integer
			int sum = 0;
			
			for (int j = 0; j <= N; j++) {
				if (j % 2 > 0) {
					sum += j;
				}
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}