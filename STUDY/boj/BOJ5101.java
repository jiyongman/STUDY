package boj;
import java.util.*;

public class BOJ5101 { // Sequences
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt(); // the first term in the sequence
			int d = sc.nextInt(); // the difference - this will be a non-zero integer
			int n = sc.nextInt(); // the value that you will need to test to determine whether it can be part of the sequence or not
			
			if (a == 0 && d == 0 && n == 0) {
				break;
			}
			
			if ((n - a) % d == 0 && (n - a) / d >= 0) {
				System.out.println((n - a) / d + 1);
			} else {
				System.out.println("X");
			}
		}
		
		sc.close();
	}
}