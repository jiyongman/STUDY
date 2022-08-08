package boj;
import java.util.*;

public class BOJ10214 { // Baseball
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for (int i = 0; i < T; i++) {
			int A = 0; // 연세대 총 득점
			int B = 0; // 고려대 총 득점
			
			for (int j = 0; j < 9; j++) {
				int Y = sc.nextInt(); // 해당 회의 연세대 득점
				int K = sc.nextInt(); // 해당 회의 고려대 득점
				A += Y;
				B += K;
			}
			
			if (A > B) {
				System.out.println("Yonsei");
			} else if (A < B) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
		}
		
		sc.close();
	}
}