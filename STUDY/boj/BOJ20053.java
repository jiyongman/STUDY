package boj;
import java.util.*;

public class BOJ20053 { // 최소, 최대 2
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 정수의 개수
			int max = -1000001;
            int min = 1000001;
            
			for (int j = 0; j < N; j++) {
				int n = sc.nextInt();
				
				if (max < n) {
					max = n;
				}
				
				if (min > n) {
					min = n;
				}
			}
			
			System.out.println(min + " " + max);
		}
		
		sc.close();
	}
}