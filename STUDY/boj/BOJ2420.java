package boj;
import java.util.*;

public class BOJ2420 { // 사파리월드

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		System.out.println(Math.abs(N - M)); // 절대값 계산
		sc.close();
	}
}