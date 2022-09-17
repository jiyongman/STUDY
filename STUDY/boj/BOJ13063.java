package boj;
import java.util.*;

public class BOJ13063 { // Lobby
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt(); // the total number of members
			int m = sc.nextInt(); // the number of members in the Conservative Party
			int k = sc.nextInt(); // the number of members in the Reformist Party
			
			if (n == 0 && m == 0 && k == 0) {
				break;
			}
			
			int p = n / 2 + 1; // the number of members to get the bill passed
			
			if (p <= m) {
				System.out.println(0);
			} else if (p - m > n - m - k) {
				System.out.println(-1);
			} else {
				System.out.println(p - m);
			}
		}
		
		sc.close();
	}
}