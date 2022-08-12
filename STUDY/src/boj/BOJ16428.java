package boj;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ16428 { // A / B - 3

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		if (A.compareTo(BigInteger.ZERO) < 0 && B.compareTo(BigInteger.ZERO) > 0) {
			System.out.println(A.divide(B).subtract(BigInteger.ONE));
			System.out.println(A.remainder(B).add(B));
		} else if (A.compareTo(BigInteger.ZERO) < 0 && B.compareTo(BigInteger.ZERO) < 0) {
			System.out.println(A.divide(B).add(BigInteger.ONE));
			System.out.println(A.remainder(B).subtract(B));
		} else {
			System.out.println(A.divide(B));
			System.out.println(A.remainder(B));
		}
		
		sc.close();
	}
}