package boj;
import java.util.*;

public class BOJ2953 { // 나는 요리사다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][4];
		int rank = 0;
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
				if (max <= sum) {
					max = sum;
					rank = i + 1;
				}
			}
		}
		
		System.out.println(rank + " " + max);
		sc.close();
	}
}