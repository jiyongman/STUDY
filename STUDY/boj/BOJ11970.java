package boj;
import java.util.*;

public class BOJ11970 { // Fence Painting
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int max = Math.max(b, d);
		int min = Math.min(a, c);
		
		if (a < d && c < b) {
			System.out.println(max - min);
		} else {
			System.out.println((b - a) + (d - c));
		}
		
		sc.close();
	}
}