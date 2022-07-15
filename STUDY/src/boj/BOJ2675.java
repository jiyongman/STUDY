package boj;
import java.util.*;

public class BOJ2675 { // 문자열 반복

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스

		for (int i = 0; i < T; i++) {
			int R = sc.nextInt(); // 반복 횟수
			String S = sc.next(); // 문자열
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}