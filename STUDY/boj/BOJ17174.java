package boj;
import java.util.*;

public class BOJ17174 { // 전체 계산 횟수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 환전한 금액
		int M = sc.nextInt(); // 묶음의 크기
		int num = N;
		
		while (N > 0) {
			num += N / M;
			N /= M;
		}
		
		System.out.println(num);
		sc.close();
	}
}