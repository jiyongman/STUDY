package boj;
import java.util.*;

public class BOJ9723 { // Right Triangle
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int x = 1; x <= T; x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.print("Case #" + x + ": ");
			
			if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}