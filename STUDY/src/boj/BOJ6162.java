package boj;
import java.util.*;

public class BOJ6162 { // Superlatives
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); // the number of data sets
		
		for (int x = 1; x <= K; x++) {
			int E = sc.nextInt(); // the amount of rain that was expected
			int A = sc.nextInt(); // the amount of rain that actually occurred
			int cnt = 0;
			
			System.out.println("Data Set " + x + ":");
			
			while (E > A) {
				A *= 5;
				cnt++;
			}
			
			if (cnt == 0) {
				System.out.print("no ");
			}
			
			for (int i = 0; i < cnt - 1; i++) {
				System.out.print("mega ");
			}
			
			System.out.println("drought");
			System.out.println();
		}
		
		sc.close();
	}
}