package boj;
import java.util.*;

public class BOJ13416 { // 주식 투자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 환규가 정리한 주식 데이터의 일수
			int max = 0;
			
			for (int j = 0; j < N; j++) {
				int A = sc.nextInt(); // A사의 주식을 구매했을 때의 손익
				int B = sc.nextInt(); // B사의 주식을 구매했을 때의 손익
				int C = sc.nextInt(); // C사의 주식을 구매했을 때의 손익
				
				if (A >= 0 || B >= 0 || C >= 0) {
					max += Math.max(A, Math.max(B, C));
				}
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}
}