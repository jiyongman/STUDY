package boj;
import java.util.*;

public class BOJ1978 { // 소수 찾기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			boolean bl = true; // 소수인 경우 true, 소수가 아닌 경우 false
			int n = sc.nextInt();
			if (n == 1) {
				continue;
			}
			
			for (int j = 2; j <= Math.sqrt(n); j++) {
				if (n % j == 0) {
					bl = false; // 소수가 아닌 경우이므로 false
					break;
				}
			}
			if (bl) { // 소수인 경우 cnt++
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}