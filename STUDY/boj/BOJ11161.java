package boj;
import java.util.*;

public class BOJ11161 { // Negative People in Da House
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			int M = sc.nextInt();
			int sum = 0;
			int max = 0;
			
			for (int j = 0; j < M; j++) {
				int P1 = sc.nextInt(); // the number of people entering the house
				int P2 = sc.nextInt(); // the number of people leaving the house
				
				sum += P2 - P1;
				max = Math.max(max, sum);
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}
}