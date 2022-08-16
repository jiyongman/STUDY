package boj;
import java.util.*;

public class BOJ14541 { // Speed Limit
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt(); // one or more data sets
			
			if (n == -1) {
				break;
			}
			
			int sum = 0;
			int t2 = 0;
			
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt(); // the speed in miles per hour
				int t = sc.nextInt(); // the total elapsed time
				
				sum += s * (t - t2);
				t2 = t;
			}
			
			System.out.println(sum + " miles");
		}

		sc.close();
	}
}