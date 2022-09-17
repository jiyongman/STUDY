package boj;
import java.util.*;

public class BOJ2609 { // 최대공약수와 최소공배수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcd(a, b); // 최대공약수
		
		System.out.println(gcd);
		System.out.println(a * b / gcd); // 최소공배수
		sc.close();
	}
	
	public static int gcd(int a, int b) { // 유클리드 호제법 (최대공약수 재귀식)
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}