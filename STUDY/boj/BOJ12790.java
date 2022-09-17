package boj;
import java.util.*;

public class BOJ12790 { // Mini Fantasy War

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			int g = sc.nextInt();
			int h = sc.nextInt();
			int hp = a + e;
			int mp = b + f;
			int atk = c + g;
			int def = d + h;
			
			if (hp < 1) {
				hp = 1;
			}
			if (mp < 1) {
				mp = 1;
			}
			if (atk < 0) {
				atk = 0;
			}
			
			int cp = hp + 5 * mp + 2 * atk + 2 * def;
			
			System.out.println(cp);
		}
		
		sc.close();
	}
}