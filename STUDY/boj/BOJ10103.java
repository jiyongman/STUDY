package boj;
import java.util.*;

public class BOJ10103 { // 주사위 게임
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 라운드의 수
		int a = 100; // 창영이의 점수
		int b = 100; // 상덕이의 점수
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(); // 창영이의 주사위에 나타난 숫자
			int y = sc.nextInt(); // 상덕이의 주사위에 나타난 숫자
			
			if (x < y) {
				a -= y;
			} else if (x > y) {
				b -= x;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}
}