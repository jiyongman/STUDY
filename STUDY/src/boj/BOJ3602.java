package boj;
import java.util.*;

public class BOJ3602 { // iChess
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt(); // the number of black tiles
		int w = sc.nextInt(); // the number of white tiles
		int n = 0; // the square number
		int s = 0; // the side length of the maximum possible square made of at most b and w tiles
		
		for (int i = 1; i <= 142; i++) {
			n = i * i;
			
			if (b + w >= n && n / 2 <= b && n / 2 <= w) {
				s = i;
			}
		}
		
		if (s > 0) {
			System.out.println(s);
		} else {
			System.out.println("Impossible");
		}
		
		sc.close();
	}
}