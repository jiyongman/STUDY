package boj;
import java.util.*;

public class BOJ6249 { // TV Reports
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of days you are hired for to record the headlines
		int p = sc.nextInt(); // the price of Dollar one day before you start your job
		int h = sc.nextInt(); // the all-time highest price of Dollar just before you start your job
		
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt(); // the price of Dollar at the ith day of your job.
			
			if (h < d) {
				System.out.println("BBTV: Dollar reached " + d + " Oshloobs, A record!");
				h = d;
				p = d;
			} else {
				if (p > d) {
					System.out.println("NTV: Dollar dropped by " + (p - d) +  " Oshloobs");
					p = d;
				} else {
					p = d;
				}
			}
		}
		
		sc.close();
	}
}