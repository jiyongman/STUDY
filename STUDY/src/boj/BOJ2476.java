package boj;
import java.util.*;

public class BOJ2476 { // 주사위 게임
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
				sum = 10000 + arr[i][0] * 1000;
			} else if (arr[i][0] == arr[i][1] || arr[i][1] == arr[i][2]) {
				sum = 1000 + arr[i][1] * 100;
			} else if (arr[i][0] == arr[i][2]) {
				sum = 1000 + arr[i][0] * 100;
			} else {
				sum = Math.max(arr[i][0], Math.max(arr[i][1], arr[i][2])) * 100;
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		sc.close();
	}
}