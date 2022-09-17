package boj;
import java.util.*;

public class BOJ13597 { // Tri-du
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // the values of the first card
		int B = sc.nextInt(); // the values of the second card
		
		if (A >= B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
		
		sc.close();
	}
}