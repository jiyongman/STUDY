package boj;
import java.util.*;

public class BOJ6131 { // 완전 제곱수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for (int B = 1; B <= 500; B++) {
			for (int A = B; A <= 500; A++) {
				if (A * A - B * B == N) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}