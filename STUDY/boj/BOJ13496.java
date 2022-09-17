package boj;
import java.util.*;

public class BOJ13496 { // The Merchant of Venice

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); // the number of input data sets in the file
		
		for (int i = 0; i < K; i++) {
			int n = sc.nextInt(); // the number of the ships Antonio owns
			int s = sc.nextInt(); // the speed of the ships in miles per day
			int d = sc.nextInt(); // the number of days until the contract's due date
			int[][] arr = new int[n][2];
			int sum = 0;
			
			for (int j = 0; j < n; j++) {
				arr[j][0] = sc.nextInt(); // the distance of ship j from Venice, in miles
				arr[j][1] = sc.nextInt(); // the value of ship j's load
				
				if ((s * d) >= arr[j][0]) {
					sum += arr[j][1];
				}
			}
			
			System.out.println("Data Set " + (i + 1) + ":");
			System.out.println(sum);
			System.out.println();
		}

		sc.close();
	}
}