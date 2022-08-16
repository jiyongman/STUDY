package boj;
import java.util.*;

public class BOJ20332 { // Divvying Up
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of contests
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int wi = sc.nextInt(); // the prize purse for each contest
			sum += wi;
		}
		
		if (sum % 3 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		sc.close();
	}
}