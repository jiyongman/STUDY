package boj;
import java.util.*;

public class BOJ9288 { // More Dice
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		
		for (int x = 1; x <= t; x++) {
			int s = sc.nextInt(); // the sum of a roll of two 6-sided dice
			
			System.out.println("Case " + x + ":");
			
			for (int y = 1; y <= s / 2; y++) {
				if (s - y <= 6) {
					System.out.println("(" + y + "," + (s - y) + ")");
				}
			}
		}
		
		sc.close();
	}
}