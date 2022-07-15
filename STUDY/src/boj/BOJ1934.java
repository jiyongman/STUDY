package boj;
import java.util.*;

public class BOJ1934 { // 최소공배수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int GCD = GCD(A, B); // 최대공약수
			System.out.println(A * B / GCD); // 최소공배수
		}
		
		sc.close();
	}
	
	public static int GCD(int A, int B) { // 유클리드 호제법
		if (B == 0) {
			return A;
		} else {
			return GCD(B, A % B);
		}
	}
}