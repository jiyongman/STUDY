package boj;
import java.util.*;

public class BOJ14470 { // 전자레인지
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 원래의 고기의 온도(℃) A != 0
		int B = sc.nextInt(); // 목표 온도(℃)
		int C = sc.nextInt(); // 얼어 있는 고기를 1℃ 데우는 데 걸리는 시간(초)
		int D = sc.nextInt(); // 얼어 있는 고기를 해동하는 데 걸리는 시간(초)
		int E = sc.nextInt(); // 얼어 있지 않은 고기를 1℃ 데우는 데 걸리는 시간(초)
		int sec = 0;
		
		if (A < 0) {
			sec = Math.abs(A) * C + D + B * E;
		} else {
			sec = (B - A) * E;
		}
		
		System.out.println(sec);
		sc.close();
	}
}