package boj;
import java.util.*;

public class BOJ15096 { // Batter Up
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of at-bats
		double sum = 0;
		double cnt = 0;
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			
			if (m == -1) {
				continue;
			} else {
				sum += m;
				cnt++;
			}
		}
		
		double s = sum / cnt; // the player’s slugging percentage
		
		System.out.println(s); 
		sc.close();
	}
}