package boj;
import java.util.*;

public class BOJ13623 { // Zero or One

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // the values chosen by Alice
		int B = sc.nextInt(); // the values chosen by Beto
		int C = sc.nextInt(); // the values chosen by Clara
		
		if (A == B && B != C) {
			System.out.println("C");
		} else if (B == C && C != A) {
			System.out.println("A");
		} else if (C == A && A != B) {
			System.out.println("B");
		} else {
			System.out.println("*");
		}
		
		sc.close();
	}
}