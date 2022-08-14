package boj;
import java.util.*;

public class BOJ15818 { // 오버플로우와 모듈러
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(); // 연산될 정수의 개수
		long M = sc.nextLong();
		long result = 1;
		
		for (int i = 0; i < N; i++) {
			long ai = sc.nextLong();
			result *= ai % M;
			result %= M;
		}
		
		System.out.println(result);
		sc.close();
	}
}