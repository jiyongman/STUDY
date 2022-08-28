package boj;
import java.util.*;

public class BOJ23103 { // Academic Distance

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of classrooms in today's schedule
		int[] x = new int[N];
		int[] y = new int[N];
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N - 1; i++) {
			a += Math.abs(x[i] - x[i + 1]);
			b += Math.abs(y[i] - y[i + 1]);
		}
		
		System.out.println(a + b);
		sc.close();
	}
}