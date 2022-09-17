package boj;
import java.util.*;

public class BOJ15036 { // Just A Minim
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of values in the tune
		double L = 0; // the length of the tune
		
		for (int i = 0; i < N; i++) {
			int C = sc.nextInt(); // the length of a value using the codes above
			
			if (C == 0) {
				L += 2;
			} else if (C == 1) {
				L++;
			} else if (C == 2) {
				L += 0.5;
			} else if (C == 4) {
				L += 0.25;
			} else if (C == 8) {
				L += 0.125;
			} else {
				L += 0.0625;
			}
		}
		
		System.out.println(L);
		sc.close();
	}
}