package boj;
import java.util.*;

public class BOJ1267 { // 핸드폰 요금

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = 0; // 영식 요금제
		int M = 0; // 민식 요금제
		int sec = 0;
		
		for (int i = 0; i < N; i++) {
			sec = sc.nextInt();
			Y += ((sec / 30) + 1) * 10;
			M += ((sec / 60) + 1) * 15;
		}
		
		if (Y == M) {
			System.out.println("Y M " + Y);
		} else if (Y > M) {
			System.out.println("M " + M);
		} else {
			System.out.println("Y " + Y);
		}
		
		sc.close();
	}
}