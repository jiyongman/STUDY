package boj;
import java.util.*;

public class BOJ9094 { // 수학적 호기심
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int cnt = 0;
			
			for (int a = 1; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					if ((a * a + b * b + m) % (a * b) == 0) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}