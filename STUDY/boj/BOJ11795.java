package boj;
import java.util.*;

public class BOJ11795 { // Donation Packaging
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of consecutive donation days
		int X = 0;
		int Y = 0;
		int Z = 0;
		
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt(); // the number of setA
			int B = sc.nextInt(); // the number of setB
			int C = sc.nextInt(); // the number of setC
			X += A;
			Y += B;
			Z += C;
			int min = Math.min(X, Math.min(Y, Z));
			
			if (min >= 30) {
				System.out.println(min);
				X -= min;
				Y -= min;
				Z -= min;
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}