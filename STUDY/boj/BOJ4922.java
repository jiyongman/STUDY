package boj;
import java.util.*;

public class BOJ4922 { // Walk Like an Egyptian

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt(); // the number of players
			
			if (N == 0) {
				break;
			}
			
			int M = 1;
			
			for (int i = 1; i <= N; i++) {
				M += 2 * (i - 1);
			}
			
			System.out.println(N + " => " + M);
		}
		
		sc.close();
	}
}