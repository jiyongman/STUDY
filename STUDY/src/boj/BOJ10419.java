package boj;
import java.util.*;

public class BOJ10419 { // 지각
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 창영이가 궁금한 경우의 수
		
		for (int i = 0; i < T; i++) {
			int d = sc.nextInt(); // 수업시간
			int t = 1; // 교수님의 지각시간
			
			while (t * t + t <= d) {
				t++;
			}
			System.out.println(t - 1);
		}
		
		sc.close();
	}
}