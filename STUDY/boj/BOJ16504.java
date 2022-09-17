package boj;
import java.util.*;

public class BOJ16504 { // 종이접기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 색종이의 가로, 세로 길이를 의미하는 정수
		long sum = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				long a = sc.nextLong();
				sum += a;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}