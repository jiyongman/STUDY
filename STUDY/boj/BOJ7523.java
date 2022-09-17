package boj;
import java.util.*;

public class BOJ7523 { // Gauß
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		long sum = 0;
		
		for (int i = 0; i < T; i++) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			sum = m * (m + 1) / 2;
			
			System.out.println("Scenario #" + (i + 1) + ":");
			
			if (n > 0) {
				sum -= (n - 1) * n / 2;
			} else {
				sum -= Math.abs(n) * Math.abs(n - 1) / 2;
			}
			
			System.out.println(sum);
			System.out.println();
		}
		
		sc.close();
	}
}