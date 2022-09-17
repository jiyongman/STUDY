package boj;
import java.util.*;

public class BOJ10870 { // 피보나치 수 5

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
		sc.close();
	}
	
	public static int fibonacci(int n) { // 피보나치 점화식
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
}