package boj;
import java.util.*;

public class BOJ10992 { // 별 찍기 - 17
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		for (int i = 2; i < N; i++) {
			for (int j = N - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		if (N != 1) {
			for (int i = 1; i <= 2 * N - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}