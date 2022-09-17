package boj;
import java.util.*;

public class BOJ2921 { // 도미노
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 도미노 세트의 크기
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			sum += i * (N + 2);
		}
		
		System.out.println(sum);
		sc.close();
	}
}