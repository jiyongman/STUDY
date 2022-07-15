package boj;
import java.util.*;

public class BOJ1173 { // 운동

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 운동 시간(분)
		int m = sc.nextInt(); // 맥박 최소치
		int M = sc.nextInt(); // 맥박 최대치
		int T = sc.nextInt(); // 맥박 증가량
		int R = sc.nextInt(); // 맥박 감소량
		int time = 0;
		int cnt = 0;
		int pulse = m;
		
		while (cnt < N) {
			if (pulse + T <= M) {
				time++;
				cnt++;
				pulse += T;
			} else {
				if (pulse - R < m) {
					time++;
					pulse = m;
				} else {
					time++;
					pulse -= R;
				}
			}
			
			if (M - m < T && pulse == m) {
				System.out.println("-1");
				return;
			}
		}
		
		System.out.println(time);
		sc.close();
	}
}