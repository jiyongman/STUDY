package boj;
import java.util.*;

public class BOJ18856 { // 피드백
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		System.out.println(N);
		
		for (int i = 0; i < N - 1; i++) {
			A[i] = i + 1;
			System.out.print(A[i] + " ");
		}
		
		A[N - 1] = 53;
		
		System.out.print(A[N - 1]);
		sc.close();
	}
}