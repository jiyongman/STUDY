package boj;
import java.util.*;

public class BOJ15780 { // 멀티탭 충분하니?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 스터디에 온 학생의 수
		int K = sc.nextInt(); // 멀티탭의 수
		int[] A = new int[K];
		int sum = 0;
		
		for (int i = 0; i < K; i++) {
			A[i] = sc.nextInt();
			
			if (A[i] % 2 == 0) {
				sum += A[i] / 2;
			} else {
				sum += A[i] / 2 + 1;
			}
		}
		
		if (sum >= N) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}