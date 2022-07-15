package boj;
import java.util.*;

public class BOJ10250 { // ACM 호텔

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt(); // 층 수
			int W = sc.nextInt(); // 방 수
			int N = sc.nextInt(); // 손님
			
			if (N % H == 0) {
				System.out.println(H * 100 + N / H);
			} else {
				System.out.println(N % H * 100 + N / H + 1);
			}
		}
		
		sc.close();
	}
}
