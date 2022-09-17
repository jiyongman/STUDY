package boj;
import java.util.*;

public class BOJ14683 { // Exactly Electrical
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // the starting coordinate(a, b)
		int b = sc.nextInt(); // the starting coordinate(a, b)
		int c = sc.nextInt(); // the destination coordinate(c, d)
		int d = sc.nextInt(); // the destination coordinate(c, d)
		int t = sc.nextInt(); // the initial number of units of electrical charge of your battery
		int m = Math.abs(a - c) + Math.abs(b - d); // the manhattan distance
		
		if (t - m >= 0 && (t - m) % 2 == 0) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		sc.close();
	}
}