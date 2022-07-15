package boj;
import java.util.*;

public class BOJ1225 { // 이상한 곱셈

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		long result = 0;
		
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				result += (A.charAt(i) - '0') * (B.charAt(j) - '0'); // 문자형을 정수형으로
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}