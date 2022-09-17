package boj;
import java.util.*;

public class BOJ10395 { // Automated Checking Machine
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] X = new int[5];
		int[] Y = new int[5];
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) {
			X[i] = sc.nextInt(); // the connection points of the first connector in the pair
		}
		
		for (int i = 0; i < 5; i++) {
			Y[i] = sc.nextInt(); // // the connection points of the second connector
			
			if (X[i] != Y[i]) {
				cnt++;
			}
		}
		
		if (cnt == 5) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		sc.close();
	}
}