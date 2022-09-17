package boj;
import java.util.*;

public class BOJ3058 { // 짝수를 찾아라
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 입력 데이터의 수
		
		for (int i = 0; i < T; i++) {
			int sum = 0;
			int min = 100;
			
			for (int j = 0; j < 7; j++) {
				int n = sc.nextInt();
				if (n % 2 == 0) {
					sum += n;
					min = Math.min(min, n);
				}
			}
			
			System.out.println(sum + " " + min);
		}
		
		sc.close();
	}
}