package boj;
import java.util.*;

public class BOJ1037 { // 약수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
        
		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.print(arr[0] * arr[N - 1]);
		sc.close();
	}
}