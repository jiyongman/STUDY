package boj;
import java.util.*;

public class BOJ15372 { // A Simple Problem.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			long N = sc.nextInt();
			long K = N * N;
			System.out.println(K);
		}
		
		sc.close();
	}
}