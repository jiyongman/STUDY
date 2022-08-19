package boj;
import java.util.*;

public class BOJ5607 { // 問題 １
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0; // the score of A
		int sum2 = 0; // the score of B
		
		for (int i = 0; i < n; i++) {
			int A = sc.nextInt(); // the number of cards n for A player
			int B = sc.nextInt(); // the number of cards n for B player
			
			if (A > B) {
				sum += A + B;
			} else if (A < B) {
				sum2 += A + B;
			} else {
				sum += A;
				sum2 += B;
			}
		}
		
		System.out.println(sum + " " + sum2);
		sc.close();
	}
}