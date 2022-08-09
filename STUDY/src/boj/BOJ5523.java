package boj;
import java.util.*;

public class BOJ5523 { // 경기 결과
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0; // A가 이긴 횟수
		int cnt2 = 0; // B가 이긴 횟수
		
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A > B) {
				cnt++;
			} else if (A < B) {
				cnt2++;
			}
		}
		
		System.out.println(cnt + " " + cnt2);
		sc.close();
	}
}