package boj;
import java.util.*;

public class BOJ9295 { // 주사위
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case " + i + ": " + (a + b));
		}
		
		sc.close();
	}
}