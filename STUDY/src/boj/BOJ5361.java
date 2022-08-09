package boj;
import java.util.*;

public class BOJ5361 { // 전투 드로이드 가격
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt(); // 필요한 블래스터 라이플의 개수
			int B = sc.nextInt(); // 필요한 시각 센서의 개수
			int C = sc.nextInt(); // 필요한 청각 센서의 개수
			int D = sc.nextInt(); // 필요한 팔의 수
			int E = sc.nextInt(); // 필요한 다리의 수
			double K = 350.34 * A + 230.90 * B + 190.55 * C + 125.30 * D + 180.90 * E;
			
			System.out.printf("$" + "%.2f", K);
			System.out.println();
		}
		
		sc.close();
	}
}