package boj;
import java.util.*;

public class BOJ23235 { // The Fastest Sorting Algorithm In The World
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while (true) {
			int N = sc.nextInt(); //  the N integers to sort, which will be given in non-decreasing order
			
			if (N == 0) {
				break;
			}
			
			for (int i = 0; i < N; i++) {
				int n = sc.nextInt();
			}
			
			System.out.println("Case " + cnt + ": Sorting... done!");
			cnt++;
		}
				
		sc.close();
	}
}