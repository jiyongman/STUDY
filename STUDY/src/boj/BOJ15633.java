package boj;
import java.util.*;

public class BOJ15633 { // Fan Death
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum * 5 - 24);
		sc.close();
	}
}