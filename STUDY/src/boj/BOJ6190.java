package boj;
import java.util.*;

public class BOJ6190 { // Another Cow Number Game
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int S = 0; // the score for this game when starting at N
		
		while (N > 1) {
			if (N % 2 > 0) {
				N = 3 * N + 1;
			} else {
				N /= 2;
			}
			S++;
		}
		
		System.out.println(S);
		sc.close();
	}
}