package boj;
import java.util.*;

public class BOJ20361 { // 일우는 야바위꾼
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 컵의 개수
		int X = sc.nextInt(); // 공이 있는 곳의 위치
		int K = sc.nextInt(); // 수행 횟수
		
		for (int i = 0; i < K; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (X == A) {
				X = B;
			} else if (X == B) {
				X = A;
			}
		}
		
		System.out.println(X);
		sc.close();
	}
}