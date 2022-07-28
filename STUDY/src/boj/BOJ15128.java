package boj;
import java.util.*;

public class BOJ15128 { // Congruent Numbers

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long p1 = sc.nextLong(); // p1 / q1 is the rational number which is the one side of a right triangle
		long q1 = sc.nextLong(); 
		long p2 = sc.nextLong(); // p2 / q2 is the rational number which is the other side of a right triangle
		long q2 = sc.nextLong();
		
		if (p1 * p2 % (q1 * q2 * 2) == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}
}