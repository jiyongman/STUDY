package boj;
import java.util.*;

public class BOJ16546 { // Missing Runners
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long S = N * (N + 1) / 2;
		long sum = 0;
		
		for (int i = 0; i < N - 1; i++) {
			long A = sc.nextLong(); // the numbers of runners who have crossed the finish line
			sum += A;
		}
		
		System.out.println(S - sum); // the runner who has not crossed the finish line
		sc.close();
	}
}