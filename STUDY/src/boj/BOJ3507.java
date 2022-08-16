package boj;
import java.util.*;

public class BOJ3507 { // Automated Telephone Exchange
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the index of Peter’s ATE
		int cnt = 0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (n - i - j == 0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}