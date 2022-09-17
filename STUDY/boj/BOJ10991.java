package boj;
import java.util.*;

public class BOJ10991 { // 별 찍기 - 16
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i + 1; j++) {
				if (j % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}