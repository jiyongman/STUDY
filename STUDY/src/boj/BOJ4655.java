package boj;
import java.util.*;

public class BOJ4655 { // Hangover
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			double c = sc.nextDouble();
			double l = 0.00;
			double n = 0; // the minimum number of cards necessary to achieve an overhang of at least c card lengths
			
			if (c == 0.00) {
				break;
			}
			
			for (double i = 1; ; i++) {
				l += 1 / (i + 1);
				
				if (l >= c) {
					n = i;
					break;
				}
			}
			
			System.out.println((int) n + " card(s)");
		}
		
		sc.close();
	}
}