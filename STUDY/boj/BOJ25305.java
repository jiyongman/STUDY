package boj;
import java.util.*;

public class BOJ25305 { // 커트라인

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 응시자의 수
		int k = sc.nextInt(); // 상을 받는 사람의 수
		Integer[] arr = new Integer[N]; // 내림차순 정렬을 위해 Integer 사용
		
		for (int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(arr[k - 1]);
		sc.close();
	}
}