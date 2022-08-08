package boj;
import java.util.*;

public class BOJ9325 { // 얼마?

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int s = sc.nextInt(); // 자동차의 가격
			int n = sc.nextInt(); // 서로 다른 옵션의 개수
			int opt = 0;
			
			for (int j = 0; j < n; j++) {
				int q = sc.nextInt(); // 해빈이가 사려고 하는 특정 옵션의 개수
				int p = sc.nextInt(); // 해당 옵션의 가격
				opt += q * p;
			}
			
			System.out.println(s + opt);
		}
		
		sc.close();
	}
}