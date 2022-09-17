package boj;
import java.util.*;

public class BOJ9501 { // 꿍의 우주여행
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 우주선의 개수
			double D = sc.nextDouble(); // 목적지 까지의 거리
			int cnt = 0;
			
			for (int j = 0; j < N; j++) {
				double vi = sc.nextDouble(); // 우주선의 최고속도
				double fi = sc.nextDouble(); // 우주선의 연료양
				double ci = sc.nextDouble(); // 우주선의 연료소비율
				
				if (D <= fi / ci * vi) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}