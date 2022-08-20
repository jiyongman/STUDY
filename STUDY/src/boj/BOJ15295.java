package boj;
import java.util.*;

public class BOJ15295 { // Chanukah Challenge
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); // the number of data sets
		
		for (int i = 0; i < P; i++) {
			int K = sc.nextInt(); // the data set number
			int N = sc.nextInt(); // the number of days to assume for the holiday
			int D = N;
			
			for (int j = 1; j <= N; j++) {
				D += j;
			}
			
			System.out.println(K + " " + D);
		}
		
		sc.close();
	}
}