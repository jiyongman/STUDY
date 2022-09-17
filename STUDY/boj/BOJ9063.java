package boj;
import java.util.*;

public class BOJ9063 { // 대지
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 점의 개수
		int[] x = new int[N];
		int[] y = new int[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		int S = (x[N - 1] - x[0]) * (y[N - 1] - y[0]);
		
		System.out.println(S);
		sc.close();
	}
}