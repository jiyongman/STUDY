package boj;
import java.util.*;

public class BOJ9699 { // RICE SACK
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // the number of case
		
		for (int x = 1; x <= c; x++) {
			int max = 0;
			
			for (int y = 1; y <= 5; y++) {
				int a = sc.nextInt();
				max = Math.max(max, a);
			}
			
			System.out.println("Case #" + x + ": " + max);
		}
		
		sc.close();
	}
}