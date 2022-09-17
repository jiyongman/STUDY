package boj;
import java.util.*;

public class BOJ10995 { // 별 찍기 - 20
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2 * N; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		
		sc.close();
	}
}