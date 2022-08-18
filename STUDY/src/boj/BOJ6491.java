package boj;
import java.util.*;

public class BOJ6491 { // Perfection
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt();
			
			if (N == 0) {
				break;
			}
			
			int sum = 0;
			
			for (int i = 1; i < N; i++) {
				if (N % i == 0) {
					sum += i;
				}
			}
			
			if (N < sum) {
				System.out.println(N + " ABUNDANT");
			} else if (N > sum) {
				System.out.println(N + " DEFICIENT");
			} else {
				System.out.println(N + " PERFECT");
			}
		}
		
		sc.close();
	}
}