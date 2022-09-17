package boj;
import java.util.*;

public class BOJ21312 { // 홀짝 칵테일
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = 1;
		
		if (A % 2 > 0) {
			result *= A;
		}
		if (B % 2 > 0) {
			result *= B;
		}
		if (C % 2 > 0) {
			result *= C;
		}
		if (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
			result = A * B * C;
		}
		
		System.out.println(result);
		sc.close();
	}
}