package boj;
import java.util.*;

public class BOJ2908 { // 상수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A = (A % 10) * 100 + (A % 100 / 10) * 10 + (A / 100);
		B = (B % 10) * 100 + (B % 100 / 10) * 10 + (B / 100);
		
		if (A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}

		sc.close();
	}
}
