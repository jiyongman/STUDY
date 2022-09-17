package boj;
import java.util.*;

public class BOJ11109 { // 괴짜 교수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int d = sc.nextInt(); // 병렬 버전을 개발하는데 걸리는 시간
			int n = sc.nextInt(); // 다음해 동안 이 프로그램이 실행되는 횟수
			int s = sc.nextInt(); // 직렬버전의 실행 시간
			int p = sc.nextInt(); // 병렬버전의 실행 시간
			
			if (n * s < n * p + d) {
				System.out.println("do not parallelize");
			} else if (n * s > n * p + d) {
				System.out.println("parallelize");
			} else {
				System.out.println("does not matter");
			}
		}
		
		sc.close();
	}
}