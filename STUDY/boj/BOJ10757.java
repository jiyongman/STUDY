package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ10757 { // 큰 수 A + B

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger(); // 큰 정수 표현
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
		sc.close();
	}
}