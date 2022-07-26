package boj;
import java.util.*;

public class BOJ13136 { // Do Not Touch Anything

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(); // 좌석의 세로 크기
		int C = sc.nextInt(); // 좌석의 가로 크기
		int N = sc.nextInt(); // CCTV가 수용할 수 있는 범위
		
		long A = R / N;
		long B = C / N;
		
		if (R % N != 0) {
			A++;
		}
		
		if (C % N != 0) {
			B++;
		} 
		
		System.out.println(A * B);
		sc.close();
	}
}