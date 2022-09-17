package boj;
import java.util.*;

public class BOJ5692 { // 팩토리얼 진법
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int T = sc.nextInt();
			int N = 1;
			int result = 0;
			
			if (T == 0) {
				break;
			}
			
			while (T > 0) {
				int num = T % 10;
				T /= 10;
				result += num * factorial(N);
				N++;
			}
			
			System.out.println(result);
		}
		
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