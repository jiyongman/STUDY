package boj;
import java.util.*;

public class BOJ15921 { // 수찬은 마린보이야!!
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (N == 0) {
			System.out.println("divide by zero");
		} else {
			System.out.println("1.00");
		}
		
		sc.close();
	}
}