package boj;
import java.util.*;

public class BOJ11006 { // 남욱이의 닭장

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 모든 닭의 다리수의 합
			int M = sc.nextInt(); // 닭의 수
			int U = 2 * M - N; // 다리가 잘린 닭의 수
			int C = M - U; // 멀쩡한 닭의 수
			
			System.out.println(U + " " + C);
		}
		
		sc.close();
	}
}