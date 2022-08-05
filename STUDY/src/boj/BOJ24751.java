package boj;
import java.util.*;

public class BOJ24751 { // Betting
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); // the percentage of switch points bet on option one
		double one = 100 / a; // the switch-payout-ratio for that option one
		double two = 100 / (100 - a); // the switch-payout-ratio for that option two
		
		System.out.printf("%.10f\n%.10f", one, two);
		sc.close();
	}
}