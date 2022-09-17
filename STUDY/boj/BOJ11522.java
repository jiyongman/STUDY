package boj;
import java.util.*;

public class BOJ11522 { // Sum Kind of Problem
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); // the number of data sets
		
		for (int i = 0; i < P; i++) {
			int K = sc.nextInt(); // the data set number
			int N = sc.nextInt();
			int S1 = N * (N + 1) / 2; // the sum of the first N positive integers
			int S2 = N * N; // the sum of the first N odd integers
			int S3 = N * N + N; // the sum of the first N even integers
			
			System.out.println(K + " " + S1 + " " + S2 + " " + S3);
		}
		
		sc.close();
	}
}