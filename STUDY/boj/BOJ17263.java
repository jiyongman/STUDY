package boj;
import java.util.*;

public class BOJ17263 { // Sort 마스터 배지훈
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		System.out.println(A[N - 1]);
		sc.close();
	}
}