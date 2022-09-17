package boj;
import java.util.*;

public class BOJ10990 { // 별 찍기 - 15
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
			}
			if (i > 0)
				System.out.print("*");

			System.out.println(" ");
		}
		
		sc.close();
	}
}