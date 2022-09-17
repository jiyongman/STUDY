package boj;
import java.util.*;

public class BOJ9085 { // 더하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < N; j++) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}