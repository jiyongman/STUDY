package boj;
import java.util.*;

public class BOJ3276 { // ICONS
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of pebbles to be arranged
		int R = 1; // the number of rows
		int C = 1; // the number of columns
		
		while (R * C < N) {
			if (R < C) {
				R++;
			} else {
				C++;
			}
		}
		
		System.out.println(R + " " + C);
		sc.close();
	}
}