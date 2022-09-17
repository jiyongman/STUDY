package boj;
import java.util.*;

public class BOJ6437 { // Golf
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while (true) {
			int p = sc.nextInt(); // the par for the hole
			int s = sc.nextInt(); // the number of strokes John needed for that hole
			
			if (p == 0 && s == 0) {
				break;
			}
			
			System.out.println("Hole #" + cnt);
			
			if (s == 1) {
				System.out.println("Hole-in-one.");
			} else if (p - s == 3) {
				System.out.println("Double eagle.");
			} else if (p - s == 2) {
				System.out.println("Eagle.");
			} else if (p - s == 1) {
				System.out.println("Birdie.");
			} else if (p - s == 0) {
				System.out.println("Par.");
			} else if (p - s == -1) {
				System.out.println("Bogey.");
			} else if (p - s <= -2) {
				System.out.println("Double Bogey.");
			}
			
			System.out.println();
			cnt++;
		}
		
		sc.close();
	}
}