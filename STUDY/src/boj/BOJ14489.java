package boj;
import java.util.*;

public class BOJ14489 { // 치킨 두 마리 (...)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 통장 1의 잔고
		int B = sc.nextInt(); // 통잔 2의 잔고
		int C = sc.nextInt(); // 치킨 한 마리의 가격
		
		if (A + B < 2 * C) {
			System.out.println(A + B);
		} else {
			System.out.println(A + B - (2 * C));
		}
		
		sc.close();
	}
}