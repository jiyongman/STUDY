package boj;
import java.util.*;

public class BOJ2775 { // 부녀회장이 될테야

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		int[][] arr = new int[15][15]; // 2차원 배열
		
		for(int i = 0; i < 15; i++) {
			arr[i][1] = 1; // i층 1호
			arr[0][i] = i; // 0층 i호
		}
		
		for (int j = 1; j < 15; j++) {
			for (int l = 2; l < 15; l++) {
				arr[j][l] = arr[j][l - 1] + arr[j - 1][l];
			}
		}
		
		for (int m = 0; m < T; m++) {
			int k = sc.nextInt(); // 층 수
			int n = sc.nextInt(); // 방 수
			System.out.println(arr[k][n]);
		}
		
		sc.close();
	}
}