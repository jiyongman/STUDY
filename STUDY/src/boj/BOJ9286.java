package boj;
import java.util.*;

public class BOJ9286 { // Gradabase

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //  the number of test cases
		
		for (int x = 1; x <= n; x++) {
			int m = sc.nextInt(); // the number of entries in that test case
			
			System.out.println("Case " + x + ":");
			
			for (int y = 0; y < m; y++) {
				int g = sc.nextInt();
				g++;
				
				if (g <= 6) {
					System.out.println(g);
				}
			}
		}
		
		sc.close();
	}
}