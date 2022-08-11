package boj;
import java.util.*;

public class BOJ11134 { // 쿠키애호가
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 철수가 가진 쿠키의 개수
			int C = sc.nextInt(); // 날마다 먹는 쿠키의 개수
			
			if (N % C == 0) {
				System.out.println(N / C);
			} else {
				System.out.println(N / C + 1);
			}
		}
		
		sc.close();
	}
}