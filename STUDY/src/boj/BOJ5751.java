package boj;
import java.util.*;

public class BOJ5751 { // Head or Tail
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int N = sc.nextInt(); // the number of games played
			
			if (N == 0) {
				break;
			}
			
			int cnt = 0;
			int cnt2 = 0;
			
			for (int i = 0; i < N; i++) {
				int Ri = sc.nextInt();
				
				if (Ri == 0) {
					cnt++;
				} else {
					cnt2++;
				}
			}
			
			System.out.println("Mary won " + cnt + " times and John won " + cnt2 + " times");
		}
		
		sc.close();
	}
}