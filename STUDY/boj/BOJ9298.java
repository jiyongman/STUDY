package boj;
import java.util.*;

public class BOJ9298 { // Ant Entrapment
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int x = 1; x <= T; x++) {
			int N = sc.nextInt(); // the number of ants
			double max = -1000;
			double max2 = -1000;
			double min = 1000;
			double min2 = 1000;
			double A = 0; // the area of the fence 
			double P = 0; // the perimeter of the fence
			
			System.out.print("Case " + x + ": ");
			
			for (int y = 0; y < N; y++) {
				double X = sc.nextDouble(); // the position of an ant(X)
				double Y = sc.nextDouble(); // the position of an ant(Y)
				max = Math.max(X, max);
				min = Math.min(X, min);
				max2 = Math.max(Y, max2);
				min2 = Math.min(Y, min2);
				A = Math.abs(max - min) * Math.abs(max2 - min2);
				P = 2 * (Math.abs(max - min) + Math.abs(max2 - min2));
			}
			
			System.out.println("Area " + A + ", Perimeter " + P);
		}
		
		sc.close();
	}
}