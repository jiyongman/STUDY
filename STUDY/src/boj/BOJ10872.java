package boj;
import java.util.*;

public class BOJ10872 { // 팩토리얼

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(factorial(N));
		sc.close();
	}
		
	public static int factorial(int N) { // 팩토리얼 점화식
		if (N <= 1) {
			return 1;
		} else {
			return N * factorial(N - 1);
		}
	}
}