package boj;
import java.util.*;

public class BOJ4562 { // No Brainer
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of data sets
		
		for (int i = 0; i < n; i++) {
			int X = sc.nextInt(); // the number of brains the zombie eats
			int Y = sc.nextInt(); // the number of brains the zombie requires to stay alive
			
			if (X >= Y) {
				System.out.println("MMM BRAINS");
			} else {
				System.out.println("NO BRAINS");
			}
		}
		
		sc.close();
	}
}