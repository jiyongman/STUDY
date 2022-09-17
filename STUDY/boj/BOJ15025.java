package boj;
import java.util.*;

public class BOJ15025 { // Judging Moose
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); // the number of tines on the left
		int r = sc.nextInt(); // the number of tines on the right
		
		if (l == 0 && r == 0) {
			System.out.print("Not a moose");
		} else if (l == r) {
			System.out.print("Even " + (l + r));
		} else {
			System.out.print("Odd " + Math.max(l, r) * 2);
		}
		
		sc.close();
	}
}