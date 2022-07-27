package boj;
import java.util.*;

public class BOJ14924 { // 폰 노이만과 파리

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // 기차의 속도
		int T = sc.nextInt(); // 파리의 속도
		int D = sc.nextInt(); // 처음 두 기차 사이의 거리
		int F = D / (2 * S) * T; // 두 기차가 만날 때까지 파리의 이동 거리
		
		System.out.println(F);
		sc.close();
	}
}