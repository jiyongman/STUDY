package boj;
import java.util.*;

public class BOJ10409 { // 서버
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 일의 개수
		int T = sc.nextInt(); // 시간(분)
		int sum = 0;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum += a;
			
			if (sum <= T) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}