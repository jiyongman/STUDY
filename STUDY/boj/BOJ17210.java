package boj;
import java.util.*;

public class BOJ17210 { // 문문문
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(); // 총 문의 개수
		int A = sc.nextInt(); // 유신이가 첫 번째 문을 통과할 때 문을 연 방법(0: 밀어서 열었을 때 or 1: 당겨서 열었을 때)
		
		if (N > 5) {
			System.out.println("Love is open door");
		} else {
			for (long i = 1; i < N; i++) {
				if (A == 0) {
					System.out.println(1);
					A = 1;
				} else {
					System.out.println(0);
					A = 0;
				}
			}
		}
		
		sc.close();
	}
}