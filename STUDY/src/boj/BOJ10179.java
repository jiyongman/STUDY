package boj;
import java.util.*;

public class BOJ10179 { // 쿠폰
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for (int i = 0; i < T; i++) {
			double a = sc.nextDouble();
			
			System.out.printf("$" + "%.2f", a * 80 / 100);
			System.out.println();
		}
		
		sc.close();
	}
}