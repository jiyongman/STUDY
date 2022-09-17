package boj;
import java.util.*;

public class BOJ13073 { // Sums
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < t; i++) {
			int N = sc.nextInt();
			int S1 = N * (N + 1) / 2;
			int S2 = N * N;
			int S3 = N * N + N;
			
			System.out.println(S1 + " " + S2 + " " + S3);
		}
		
		sc.close();
	}
}
