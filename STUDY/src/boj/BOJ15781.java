package boj;
import java.util.*;

public class BOJ15781 { // 헬멧과 조끼
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 맵에 존재하는 헬멧의 개수
		int M = sc.nextInt(); // 맵에 존재하는 죄끼의 개수
		int[] h = new int[N];
		int[] a = new int[M];
		
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
		Arrays.sort(a);
		System.out.println(h[N - 1] + a[M - 1]);
		sc.close();
	}
}