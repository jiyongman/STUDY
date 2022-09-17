package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ1252 { // 이진수 덧셈

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		String str1 = a.toString();
		String str2 = b.toString();
		
		BigInteger m = new BigInteger(str1, 2); // 2진수로 표현
		BigInteger n = new BigInteger(str2, 2); // 2진수로 표현
		BigInteger sum = m.add(n);
		String result = sum.toString(2);
		
		System.out.println(result);
		sc.close();
	}
}