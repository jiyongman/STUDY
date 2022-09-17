package boj;
import java.util.*;

public class BOJ16239 { // Nadan
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= N - 1; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println(K - sum);
		sc.close();
	}
}