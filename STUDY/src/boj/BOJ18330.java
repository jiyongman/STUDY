package boj;
import java.util.*;

public class BOJ18330 { // Petrol

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the amount of petrol that will be used in the next month
		int k = sc.nextInt(); // the quota left in Mahya’s fuel card at the end of current month
		int m = 60; // the quota of 60 liters per month in a fuel card
		
		if (n <= k + m) {
			System.out.println(n * 1500);
		} else {
			System.out.println((k + m) * 1500 + (n - (k + m)) * 3000);
		}
		
		sc.close();
	}
}