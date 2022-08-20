package boj;
import java.util.*;

public class BOJ9848 { // Gift
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of days
		int k = sc.nextInt(); // the desired improvement (in milliseconds)
		int t = sc.nextInt(); // // Jacqueline’s daily timing in milliseconds
		int cnt = 0;
		
		for (int i = 0; i < n - 1; i++) {
			int t2 = sc.nextInt(); // Jacqueline’s daily timing in milliseconds
			
			if (t - t2 >= k) {
				cnt++;
			}
			
			t = t2;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}