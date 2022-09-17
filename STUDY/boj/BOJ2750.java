package boj;
import java.util.*;

public class BOJ2750 { // 수 정렬하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int tmp;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) { // 선택정렬
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
