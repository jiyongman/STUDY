package boj;
import java.util.*;

public class BOJ1018 { // 체스판 다시 칠하기
	
	public static boolean[][] arr;
	public static int min = 64; // 8x8 크기의 체스판에서 바꿔야 하는 최댓값은 모두 바꾸는 경우 64
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				check(i, j);
			}
		}
		
		System.out.println(min);
		sc.close();
	}
	
	public static void check(int x, int y) {
		
		int cnt = 0;
		boolean bl = arr[x][y]; // 전달받은 좌표의 좌상단 체스 색을 저장
		
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (arr[i][j] != bl) { // 체스판의 시작 색과 같지 않은 경우
					cnt++;
				}
				bl = !bl; // 색 변경
			}
			bl = !bl; // 색 변경
		}
		
		cnt = Math.min(cnt, 64 - cnt); // 색의 변경 횟수(cnt)와 반대 색의 변경 횟수(64 - cnt) 중 최솟값을 저장
		min = Math.min(min, cnt); // 최솟값보다 현재 cnt 값이 더 작을 경우 최솟값을 갱신 
	}
}