package boj;
import java.util.*;

public class BOJ17496 { // 스타후르츠
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 여름의 일 수
		int T = sc.nextInt(); // 스타후르츠가 자라는데 걸리는 일 수
		int C = sc.nextInt(); // 스타후르츠를 심을 수 있는 칸의 수
		int P = sc.nextInt(); // 스타후르츠 개당 가격
		int profit = 0;
		
		if (N % T > 0) {
			profit = (N / T) * (C * P);
		} else {
			profit = ((N / T) - 1) * (C * P);
		}
		
		System.out.println(profit);
		sc.close();
	}
}