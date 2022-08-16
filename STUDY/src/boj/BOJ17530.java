package boj;
import java.util.*;

public class BOJ17530 { // Buffoon
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // the number of votes each candidate received, in order of registration
			max = Math.max(max, arr[i]);
		}
		
		if (arr[0] == max) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		
		sc.close();
	}
}