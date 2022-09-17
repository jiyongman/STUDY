package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ6974 { // Long Division

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < n; i++) {
			BigInteger a = sc.nextBigInteger(); // the dividend
			BigInteger b = sc.nextBigInteger(); // the divisor
			
			System.out.println(a.divide(b));
			System.out.println(a.remainder(b));
			System.out.println();
		}
		
		sc.close();
	}
}