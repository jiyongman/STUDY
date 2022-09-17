package boj;
import java.util.*;

public class BOJ10480 { // Oddities
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (Math.abs(x) % 2 > 0) {
				System.out.println(x + " is odd");
			} else {
				System.out.println(x + " is even");
			}
		}
		
		sc.close();
	}
}