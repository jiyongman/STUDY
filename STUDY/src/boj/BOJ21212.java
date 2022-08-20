package boj;
import java.util.*;

public class BOJ21212 { // Cakes
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int min = 10000;
		
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt(); // the required quantity of this ingredient per cake
			int B = sc.nextInt(); // the quantity of this ingredient you have in your kitchen
			arr[i] = B / A;
			min = Math.min(min, arr[i]);
		}
		
		System.out.println(min);
		sc.close();
	}
}