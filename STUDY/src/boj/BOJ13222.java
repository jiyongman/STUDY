package boj;
import java.util.*;

public class BOJ13222 { // Matches
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of matches on the floor
		int W = sc.nextInt(); // the dimensions of the box(width)
		int H = sc.nextInt(); // the dimensions of the box(height)
		
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt(); // the length of one match
			
			if (W * W + H * H >= L * L) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}