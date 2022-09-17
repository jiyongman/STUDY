package boj;
import java.util.*;

public class BOJ15734 { // 명장 남정훈
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); // 왼발잡이 선수의 수
		int R = sc.nextInt(); // 오른발 잡이 선수의 수
		int A = sc.nextInt(); // 양발잡이 선수의 수
		
		while (A > 0) {
			if (L < R) {
				L++;
			} else {
				R++;
			}
			A--;
		}
		
		System.out.println(Math.min(L, R) * 2);
		sc.close();
	}
}