package boj;
import java.util.*;

public class BOJ14568 { // 2017 연세대학교 프로그래밍 경시대회
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사탕의 총 개수
		int cnt = 0;
		
		for (int A = 1; A <= 100; A++) { // 택희가 받은 사탕의 수
			for (int B = 1; B <= 100 - A; B++) { // 영훈이가 받은 사탕의 수
				for (int C = 1; C <= 100 - A - B; C++) { // 남규가 받은 사탕의 수
					if (A + B + C == N && C >= B + 2 && (A > 0 && B > 0 && C > 0) && A % 2 == 0) {
						cnt++;
					}
				}
			}
		}
			
		System.out.println(cnt);
		sc.close();
	}
}