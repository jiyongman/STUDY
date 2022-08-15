package boj;
import java.util.*;

public class BOJ13610 { // Volta
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // the times that the fastest driver take to complete a lap
		int Y = sc.nextInt(); // the times that the slowest driver take to complete a lap
		int N = 1; // the lap at which the slowest driver will become a laggard
		
		while (true) {
			if ((Y - X) * N >= Y) {
				break;
			}
			N++;
		}
		
		System.out.println(N);
		sc.close();
	}
}