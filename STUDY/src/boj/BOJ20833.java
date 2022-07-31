package boj;
import java.util.*;

public class BOJ20833 { // Kuber
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0; // the number of small cubes Nadja needs
		
		for (int i = 1; i <= N; i++) {
			sum += Math.pow(i, 3);
		}
		
		System.out.println(sum);
		sc.close();
	}
}