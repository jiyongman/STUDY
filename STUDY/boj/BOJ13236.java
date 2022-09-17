package boj;
import java.util.*;

public class BOJ13236 { // Collatz Conjecture
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (true) {
			
			System.out.print(n + " ");
			
			if (n == 1) {
				break;
			}
			
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
		}
		
		sc.close();
	}
}