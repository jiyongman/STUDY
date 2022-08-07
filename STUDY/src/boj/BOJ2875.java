package boj;
import java.util.*;

public class BOJ2875 { // 대회 or 인턴
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 여학생의 수
		int M = sc.nextInt(); // 남학생의 수
		int K = sc.nextInt(); // 인턴십에 참여해야 하는 인원
		int cnt = 0;
		
		while (true) {
			if (N >= 2 && M >= 1 && N + M >= 3 + K) {
				cnt++;
				N -= 2;
				M--;
			} else {
				break;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}