package boj;
import java.util.*;

public class BOJ25377 { // 빵
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 가게의 수
		int min = 1000;
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt(); // 현재 위치에서 가게까지 가는 데 걸리는 시간
			int B = sc.nextInt(); // 현재 시점에서 빵이 들어올 때까지 시간
			if (A <= B) {
				min = Math.min(min, B);
				cnt++;
			}
		}
		
		if (cnt > 0) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}