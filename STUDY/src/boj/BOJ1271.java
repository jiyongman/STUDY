package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ1271 { // 엄청난 부자2

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		System.out.println(n.divide(m)); // 나누기 divide()
		System.out.println(n.remainder(m)); // 나머지 remainder()
		sc.close();
	}
}