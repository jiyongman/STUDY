package boj;
import java.util.*;

public class BOJ6030 { // Scavenger Hunt
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		
		for (int i = 1; i <= P; i++) {
			for (int j = 1; j <= Q; j++) {
				if (P % i == 0 && Q % j == 0) {
					System.out.println(i + " " + j);
				}
			}
		}
		
		sc.close();
	}
}