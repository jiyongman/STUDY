package boj;
import java.util.*;

public class BOJ2460 { // 지능형 기차 2

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][2];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int num = 0;
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			num += arr[i][1] - arr[i][0];
			max = Math.max(max, num);
		}
		
		System.out.println(max);
		sc.close();
	}
}