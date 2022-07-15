package codeup;
import java.math.BigInteger;
import java.util.*;

public class CODEUP1038 { // 정수 2개 입력받아 합 출력하기1

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		sc.close();
	}
}