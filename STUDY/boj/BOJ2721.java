package boj;
import java.util.*;

public class BOJ2721 { // 삼각수의 합
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int sum = 0;
			
			for (int j = 1; j <= n; j++) {
				sum += j * (j + 1) * (j + 2) / 2; 
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}