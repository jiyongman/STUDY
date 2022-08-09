package boj;
import java.util.*;

public class BOJ10178 { // 할로윈의 사탕
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for (int i = 0; i < T; i++) {
			int c = sc.nextInt(); // 사탕의 개수
			int v = sc.nextInt(); // 형제의 수
			int a = c / v;
			int b = c % v;
			
			System.out.println("You get " + a + " piece(s) and your dad gets " + b + " piece(s).");
		}
		
		sc.close();
	}
}