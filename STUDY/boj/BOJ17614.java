package boj;
import java.util.*;

public class BOJ17614 { // 369
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
			
			while (arr[i] > 0) {
				if (arr[i] % 10 == 3 || arr[i] % 10 == 6 || arr[i] % 10 == 9) {
					cnt++;
				}
				arr[i] /= 10;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}