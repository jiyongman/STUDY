package boj;
import java.util.*;

public class BOJ18127 { // 모형결정
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 결정의 모양이 A개의 변을 가진 정다각형
		int B = sc.nextInt(); // 온도가 섭씨 –B도
		long N = 1; // 증가하는 최소 결정의 수
		long sum = 1; // 최소 결정의 개수
		
		for (int i = 0; i < B; i++) {
			N += A - 2;
			sum += N;
		}
		
		System.out.println(sum);
		sc.close();
	}
}