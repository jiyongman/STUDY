package boj;
import java.util.*;

public class BOJ1547 { // 공

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // 바꾼 횟수
		int num = 1; // 공의 위치
		
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (num == x) {
				num = y;
			} else if (num == y) {
				num = x;
			}
		}
		
		System.out.println(num);
		sc.close();
	}
}