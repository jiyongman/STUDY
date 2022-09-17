package boj;
import java.util.*;

public class BOJ12840 { // 창용이의 시계
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // 초기 현재 시간(시)
		int m = sc.nextInt(); // 초기 현재 시간(분)
		int s = sc.nextInt(); // 초기 현재 시간(초)
		int q = sc.nextInt(); // 쿼리의 개수
		int t = 3600 * h + 60 * m + s;
		
		for (int i = 0; i < q; i++) {
			int T = sc.nextInt();
			
			if (T == 1) {
				int c = sc.nextInt();
				t = (t + c) % 86400;
			} else if (T == 2) {
				int c = sc.nextInt();
				t = (t - c) % 86400;
				if (t < 0) {
					t += 86400;
				}
			} else {
				System.out.println(t / 3600 + " " + t / 60 % 60 + " " + t % 60);
			}
		}
		
		sc.close();
	}
}