package boj;
import java.util.*;

public class BOJ9550 { // 아이들은 사탕을 좋아해
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 승택이가 갖고 있는 사탕의 종류의 수
			int K = sc.nextInt(); // 아이들이 최소한 먹어야 하는 사탕의 수
			int sum = 0;
			
			for (int j = 0; j < N; j++) {
				int a = sc.nextInt();
				sum += a / K;
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}