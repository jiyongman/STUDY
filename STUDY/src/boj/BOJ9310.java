package boj;
import java.util.*;

public class BOJ9310 { // Arithmetic and Geometric Sums
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt(); // the sum should be computed
			
			if (N == 0) {
				break;
			}
			
			int a1 = sc.nextInt(); // the series of numbers
			int a2 = sc.nextInt(); // the series of numbers
			int a3 = sc.nextInt(); // the series of numbers
			double Sn = 0;
			int d = a2 - a1;
			int r = a2 / a1;
			
			if (a2 - a1 == a3 - a2) {
				Sn = N * (2 * a1 + (N - 1) * d) / 2;
			} else {
				Sn = a1 * (Math.pow(r, N) - 1) / (r - 1);
			}
			
			System.out.println((int) Sn);
		}
		
		sc.close();
	}
}