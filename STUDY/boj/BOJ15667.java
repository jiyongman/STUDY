package boj;
import java.util.*;

public class BOJ15667 { // 2018 연세대학교 프로그래밍 경진대회
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 불꽃의 수
		
		for (int i = 0; i < 101; i++) {
			if (i * i + i + 1 == N) {
				int K = i;
				System.out.println(K);
				break;
			}
		}
		
		sc.close();
	}
}