package boj;
import java.util.*;

public class BOJ1292 { // 쉽게 푸는 문제

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 구간의 시작
		int B = sc.nextInt(); // 구간의 끝
		int[] arr = new int[B];
		int cnt = 0;
		
		for (int i = 1; i <= B; i++) { // 1 2 2 3 3 3 수열 입력
			for (int j = 0; j < i; j++) {
				if (cnt == B) {
					break;
				}
				arr[cnt] = i;
				cnt++;
			}
		}
		
		int sum = 0;
		
		for (int i = A; i <= B; i++) { // A번째 숫자부터 B번째 숫자까지 합
			sum += arr[i - 1];
		}
		
		System.out.println(sum);
		sc.close();
	}
}