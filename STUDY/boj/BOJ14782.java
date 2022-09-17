package boj;
import java.util.*;

public class BOJ14782 { // Bedtime Reading, I

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int I = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= I; i++) {
			if (I % i == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}