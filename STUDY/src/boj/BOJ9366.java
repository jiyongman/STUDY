package boj;
import java.util.*;

public class BOJ9366 { // 삼각형 분류

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			System.out.print("Case #" + (i + 1) + ": ");
			
			if (A + B <= C || A + C <= B || B + C <= A) {
				System.out.println("invalid!");
			} else {
				if (A == B && B == C) {
					System.out.println("equilateral");
				} else if (A == B || B == C || C == A) {
					System.out.println("isosceles");
				} else {
					System.out.println("scalene");
				}
			}
		}
		
		sc.close();
	}
}