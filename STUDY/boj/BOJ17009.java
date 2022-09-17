package boj;
import java.util.*;

public class BOJ17009 { // Winning Score
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A3 = sc.nextInt(); // the number of successful 3-point shots scoring of the Apples
		int A2 = sc.nextInt(); // the number of successful 2-point field goals scoring of the Apples
		int A1 = sc.nextInt(); // the number of successful 1-point free throws scoring of the Apples
		int B3 = sc.nextInt(); // the number of successful 3-point shots scoring of the Bananas
		int B2 = sc.nextInt(); // the number of successful 2-point field goals scoring of the Bananas
		int B1 = sc.nextInt(); // the number of successful 1-point free throws scoring of the Bananas
		int A = 3 * A3 + 2 * A2 + A1;
		int B = 3 * B3 + 2 * B2 + B1;
		
		if (A > B) {
			System.out.println("A");
		} else if (A < B) {
			System.out.println("B");
		} else {
			System.out.println("T");
		}
		
		sc.close();
	}
}