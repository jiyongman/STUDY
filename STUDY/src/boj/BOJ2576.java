package boj;
import java.util.*;

public class BOJ2576 { // 홀수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		
		for (int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int min = 100;
		
		for (int i = 0; i < 7; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
				min = Math.min(min, arr[i]);
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
}