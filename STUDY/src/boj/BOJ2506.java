package boj;
import java.util.*;

public class BOJ2506 { // 점수계산

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			if (arr[i] == 1) {
				cnt++;
				sum += cnt;
			} else {
				cnt = 0;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}