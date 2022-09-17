package boj;
import java.util.*;

public class BOJ6779 { // Who Has Seen The Wind
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // the humidity factor
		int M = sc.nextInt(); // the maximum number of hours Margaret will wait for the weather balloon to return to ground
		
		for (int t = 1; t <= M; t++) {
			if (-6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t <= 0) {
				System.out.println("The balloon first touches ground at hour: " + t);
				return;
			}
		}
		
		System.out.println("The balloon does not touch ground in the given time.");
		sc.close();
	}
}