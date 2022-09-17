package boj;
import java.util.*;

public class BOJ18247 { // 겨울왕국 티켓 예매
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 영화관 자리의 열 개수
			int M = sc.nextInt(); // 영화관 한 열에 속한 좌석 개수
			
			if (N >= 12 && M >= 4) {
				System.out.println(11 * M + 4);
			} else {
				System.out.println(-1);
			}
		}
		
		sc.close();
	}
}