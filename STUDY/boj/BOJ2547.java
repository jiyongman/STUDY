package boj;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ2547 { // 사탕 선생 고창영
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			BigInteger N = sc.nextBigInteger(); // 학생의 수
			BigInteger sum = new BigInteger("0");
			
			for (int j = 0; j < N.intValue(); j++) {
				BigInteger A = sc.nextBigInteger(); // 학생들이 가져온 사탕의 수
				sum = sum.add(A);
			}
			
			if (sum.remainder(N) == BigInteger.ZERO) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}