package boj;
import java.util.*;

public class BOJ1731 { // 추론

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열의 길이
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (arr[1] - arr[0] == arr[2] - arr[1]) { // 등차수열
			System.out.println(arr[arr.length - 1] + (arr[1] - arr[0])); 
		} else { // 등비수열
			System.out.println(arr[arr.length - 1] * (arr[1] / arr[0])); 
		}
		
		sc.close();
	}
}