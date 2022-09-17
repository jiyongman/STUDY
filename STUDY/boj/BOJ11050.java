package boj;
import java.util.*;

public class BOJ11050 { // 이항 계수 1

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
		sc.close();
	}
	
	public static int factorial(int N) {
		if (N <= 1) {
			return 1;
		} else {
			return N * factorial(N - 1);
		}
	}
}