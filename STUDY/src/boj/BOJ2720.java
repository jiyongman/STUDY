package boj;
import java.util.*;

public class BOJ2720 { // 세탁소 사장 동혁
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int Q; // Quarter($0.25)
		int D; // Dime($0.1)
		int N; // Nickel($0.05)
		int P; // Penny($0.01)
		
		for (int i = 0; i < T; i++) {
			int C = sc.nextInt(); // Cent
			Q = C / 25;
			C %= 25;
			D = C / 10;
			C %= 10;
			N = C / 5;
			C %= 5;
			P = C / 1;
			C %= 1;
			System.out.print(Q + " " + D + " " + N + " " + P);
			System.out.println();
		}
		
		sc.close();
	}
}