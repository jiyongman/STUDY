package boj;
import java.util.*;

public class BOJ17869 { // Simple Collatz Sequence
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int cnt = 0;
		
		while (true) {
			
			if (n % 2 > 0) {
				n++;
			} else {
				n /= 2;
			}
			
			cnt++;
			
			if (n == 1) {
				break;
			}
			
		}
		
		System.out.println(cnt);
		sc.close();
	}
}