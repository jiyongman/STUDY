package boj;
import java.util.*;

public class BOJ10833 { // 사과
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 학교의 수
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += arr[i][1] % arr[i][0];
		}
		
		System.out.println(sum);
		sc.close();
	}
}