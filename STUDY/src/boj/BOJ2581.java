package boj;
import java.util.*;

public class BOJ2581 { // 소수
	
	public static boolean[] bl;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		bl = new boolean[N + 1];
		get_bl();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = M; i <= N; i++) {
			if (bl[i] == false) { // i번째 배열이 소수라면
				sum += i;
				if (min == Integer.MAX_VALUE) { 
					min = i;
				}
			}
		}
		
		if (sum == 0) { // 소수가 존재하지 않는다면
			System.out.println(-1);
		} else { // 소수가 존재한다면
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
	
	public static void get_bl() { // 에라토스테네스의 체 알고리즘
		
		bl[0] = true;
		bl[1] = true;
		
		for (int i = 2; i <= Math.sqrt(bl.length); i++) {
			for (int j = i * i; j < bl.length; j += i) {
				bl[j] = true; // 소수가 아닌 수 
			}
		}
	}
}