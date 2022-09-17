package boj;
import java.util.*;

public class BOJ13484 { // Tarifa
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // the number of megabytes that Pero use up to surf the internet per month
		int N = sc.nextInt(); // the number of months of using the plan
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int Pi = sc.nextInt(); // the number of megabytes spent in each of the first N months of using the plan
			sum += Pi;
		}
		
		System.out.println(X * (N + 1) - sum);
		sc.close();
	}
}