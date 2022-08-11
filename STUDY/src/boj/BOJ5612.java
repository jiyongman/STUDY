package boj;
import java.util.*;

public class BOJ5612 { // 터널의 입구와 출구
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 조사한 시간
		int m = sc.nextInt(); // 조사를 시작할 때, 터널 안에 들어있는 차량의 수
		int max = m; // 터널 안에 있는 차량의 수의 최댓값
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(); // 입구를 통과한 차의 수
			int b = sc.nextInt(); // 출구를 통과한 차의 수
			m += a - b;
			max = Math.max(max, m);
			
			if (m < 0) {
				max = 0;
				break;
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}