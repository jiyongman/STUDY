package boj;
import java.util.*;

public class BOJ10698 { // Ahmed Aly
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int n = 1; n <= T; n++) {
			int X = sc.nextInt();
			String O = sc.next(); // either '+' or '-'
			int Y = sc.nextInt();
			String P = sc.next(); // '='
			int Z = sc.nextInt();
			
			System.out.print("Case " + n + ": ");
			
			if (X + Y == Z && O.equals("+")) {
				System.out.println("YES");
			} else if (X - Y == Z && O.equals("-")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}