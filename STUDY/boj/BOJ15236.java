package boj;
import java.util.*;

public class BOJ15236 { // Dominos
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the size of the complete set
		int sum = 0;
		
		for (int i = 1; i <= N; i++) {
			sum += i * (N + 2);
		}
		
		System.out.println(sum);
		sc.close();
	}
}