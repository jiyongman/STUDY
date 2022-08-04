package boj;
import java.util.*;

public class BOJ1463 { // 1로 만들기
	
	static Integer[] dp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
		
		System.out.println(recursive(N));
		sc.close();
	}
	
	static int recursive(int N) {
		
		if (dp[N] == null) { // 탐색하지 않았던 N인 경우
			if (N % 6 == 0) { // 6으로 나누어지는 경우
				dp[N] = Math.min(recursive(N - 1), Math.min(recursive(N / 3), recursive(N / 2))) + 1;
			} else if (N % 3 == 0) { // 3으로 나누어지는 경우
				dp[N] = Math.min(recursive(N / 3), recursive(N - 1)) + 1;
			} else if (N % 2 == 0) { // 2로 나누어지는 경우
				dp[N] = Math.min(recursive(N / 2), recursive(N - 1)) + 1;
			} else { // 2와 3으로 나누어지지 않는 경우
				dp[N] = recursive(N - 1) + 1;
			}
		}
		
		return dp[N];
	}
}