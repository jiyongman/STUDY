package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ2338 { // 긴자리 계산

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B)); // 더하기
		System.out.println(A.subtract(B)); // 빼기
		System.out.println(A.multiply(B)); // 곱하기
		sc.close();
	}
}