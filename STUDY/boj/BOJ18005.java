package boj;
import java.util.*;

public class BOJ18005 { // Even or Odd?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if (n % 2 > 0) {
			System.out.println(0);
		} else {
			if (n * (n + 1) / 2 % 2 > 0) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
		
		sc.close();
	}
}