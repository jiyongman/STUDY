package boj;
import java.util.*;

public class BOJ21185 { // Some Sum
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N % 2 > 0) {
			System.out.println("Either");
		} else {
			if (N * (N + 1) / 2 % 2 > 0) {
				System.out.println("Odd");
			} else {
				System.out.println("Even");
			}
		}
		
		sc.close();
	}
}