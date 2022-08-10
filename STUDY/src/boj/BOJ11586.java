package boj;
import java.util.*;

public class BOJ11586 { // 지영 공주님의 마법 거울
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정사각형 모양의 마법거울의 크기
		char[][] arr = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int K = sc.nextInt(); // 마법거울의 심리상태
		
		if (K == 1) { // 그대로
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		} else if (K == 2) { // 좌우 반전
			for (int i = 0; i < N; i++) {
				for (int j = N - 1; j >= 0; j--) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		} else { // 상하 반전
			for (int i = N - 1; i >= 0; i--) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}