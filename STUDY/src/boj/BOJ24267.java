package boj;
import java.util.*;

public class BOJ24267 { // 알고리즘 수업 - 알고리즘의 수행 시간 6
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println((n - 2) * (n - 1) * n / 6);
		System.out.println(3);
		sc.close();
	}
}