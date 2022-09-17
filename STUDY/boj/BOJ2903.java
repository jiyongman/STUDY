package boj;
import java.util.*;

public class BOJ2903 { // 중앙 이동 알고리즘
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double a = Math.pow(2, N);
		double b = Math.pow(a + 1, 2);
		
		System.out.println((int) b);
		sc.close();
	}
}