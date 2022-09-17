package boj;
import java.util.*;

public class BOJ1009 { // 분산처리
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 1;
			
			for (int j = 0; j < b; j++) {
				result = result * a % 10;
			}
			
			if (result == 0) {
				System.out.println(10); // 나머지가 0인 경우 10으로 처리
			} else {
				System.out.println(result);
			}
		}
		
		sc.close();
	}
}	
