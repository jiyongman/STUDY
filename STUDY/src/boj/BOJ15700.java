package boj;
import java.util.*;

public class BOJ15700 { // 타일 채우기 4

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		System.out.println(N * M / 2);
		sc.close();
	}
}