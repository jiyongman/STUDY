package boj;
import java.util.*;

public class BOJ14623 { // 감정이입
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long B1 = Long.parseLong(sc.next(), 2); // 2진수를 10진수로
		long B2 = Long.parseLong(sc.next(), 2); // 2진수를 10진수로
		
		System.out.println(Long.toBinaryString(B1 * B2)); // 10진수를 2진수 문자열로
		sc.close();
	}
}