package boj;
import java.util.*;

public class BOJ17903 { // Counting Clauses

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // the number of clauses
		int n = sc.nextInt(); // the number of variables

		if (m >= 8) {
			System.out.println("satisfactory");
		} else {
			System.out.println("unsatisfactory");
		}
		
		sc.close();
	}
}