package codeup;
import java.util.*;

public class CODEUP1098 { // 설탕과자 뽑기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // 격자판의 세로
		int w = sc.nextInt(); // 격자판의 가로
		int n = sc.nextInt(); // 놓을 수 있는 막대의 수
		int[][] arr = new int[h][w];
		
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt(); // 막대의 길이
			int d = sc.nextInt(); // 막대의 방향
			int x = sc.nextInt(); // 막대의 좌표
			int y = sc.nextInt(); // 막대의 좌표
			
			for (int j = 0; j < l; j++) {
				if (d == 1) {
					arr[x - 1 + j][y - 1] = 1;
				} else {
					arr[x - 1][y - 1 + j] = 1;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}