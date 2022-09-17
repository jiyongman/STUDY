package boj;
import java.util.*;

public class BOJ6794 { // What is n, Daddy?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				if (i + j == n) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}