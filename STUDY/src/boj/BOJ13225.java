package boj;
import java.util.*;

public class BOJ13225 { // Divisors

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); // the amount of numbers you need to process
		
		for (int i = 0; i < C; i++) {
			int n = sc.nextInt(); // the number of divisors you have to compute
			int cnt = 0;
			
			for (int j = 1; j <= n; j++) {
				
				if (n % j == 0) {
					cnt++;
				}
			}
			
			System.out.println(n + " " + cnt);
		}
		
		sc.close();
	}
}