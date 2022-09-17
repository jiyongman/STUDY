package boj;
import java.util.*;

public class BOJ5235 { // Even Sum More Than Odd Sum
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt(); // the number of elements in the sequence
			int sum = 0;
			int sum2 = 0;
			
			for (int j = 0; j < k; j++) {
				int n = sc.nextInt();
				
				if (n % 2 > 0) {
					sum += n;
				} else {
					sum2 += n;
				}
			}
			
			if (sum > sum2) {
				System.out.println("ODD");
			} else if (sum < sum2) {
				System.out.println("EVEN");
			} else {
				System.out.println("TIE");
			}
		}
		
		sc.close();
	}
}