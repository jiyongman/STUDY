package boj;
import java.util.*;

public class BOJ13240 { // Chessboard
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of rows
		int M = sc.nextInt(); // the number of columns
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}