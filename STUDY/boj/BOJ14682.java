package boj;
import java.util.*;

public class BOJ14682 { // Shifty Sum
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt(); // the number of times to shift N
		int sum = 0;
		
		for (int i = 0; i <= k; i++) {
			sum += N * Math.pow(10, i);
		}
		
		System.out.println(sum);
		sc.close();
	}
}