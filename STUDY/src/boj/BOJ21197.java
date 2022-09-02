package boj;
import java.util.*;

public class BOJ21197 { // Stopwatch
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of times the stopwatch was pressed.
		int[] t = new int[N];
		
		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt(); // the time the button was pressed
		}
		
		int sum = 0; // the number of seconds displayed on the stopwatch's timer
		
		if (N % 2 == 0) {
			for (int i = 0; i < N - 1; i += 2) {
				sum += t[i + 1] - t[i];
			}
			System.out.println(sum);
		} else {
			System.out.println("still running");
		}
		
		sc.close();
	}
}