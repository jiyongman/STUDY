package boj;
import java.util.*;

public class BOJ25494 { // 단순한 문제 (Small)
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
	
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int cnt = 0;
		
			for (int x = 1; x <= a; x++) {
				for (int y = 1; y <= b; y++) {
					for (int z = 1; z <= c; z++) {
						if (x % y == y % z && y % z == z % x && z % x == x % y) {
							cnt++;
						}
					}
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}