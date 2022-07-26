package boj;
import java.util.*;
	
public class BOJ1065 { // 한수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
			
		System.out.println(function(N));
		sc.close();
	}
	
	static int function(int N) { // 한수 함수
			
		int cnt = 0;
			
		for (int i = 1; i <= N; i++) {
			if (i < 100) {
				cnt++;
			} else if (i < 1000) {
				int a = i / 100; // 백의 자리 수
				int b = i / 10 % 10; // 십의 자리 수
				int c = i % 10; // 일의 자리 수
				if (a - b == b - c) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}