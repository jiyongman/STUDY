package boj;
import java.util.*;

public class BOJ19602 { // Dog Treats
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // the number of small treats
		int M = sc.nextInt(); // the number of medium treats
		int L = sc.nextInt(); // the number of large treats
		int H = S + 2 * M + 3 * L; // the formula of Barley's happiness score
		
		if (H >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
		
		sc.close();
	}
}