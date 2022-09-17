package boj;
import java.util.*;

public class BOJ20410 { // 추첨상 사수 대작전! (Easy)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // 준표가 좋아하는 소수
		int Seed = sc.nextInt(); // 시연 참가자들이 정한 수
		int X1 = sc.nextInt(); // 시연으로 공개된 수
		int X2 = sc.nextInt(); // 시연으로 공개된 수
		
		for (int a = 0; a < m; a++) {
			for (int c = 0; c < m; c++) {
				if (X1 == (a * Seed + c) % m && X2 == (a * X1 + c) % m) {
					System.out.println(a + " " + c);
					return;
				}
			}
		}
		
		sc.close();
	}
}