package boj;
import java.util.*;

public class BOJ8932 { // 7종 경기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt(); // 100미터 허들(트랙)
			int b = sc.nextInt(); // 높이뛰기(필드)
			int c = sc.nextInt(); // 포환던지기(필드)
			int d = sc.nextInt(); // 200미터 달리기(트랙)
			int e = sc.nextInt(); // 멀리뛰기(필드)
			int f = sc.nextInt(); // 창던지기(필드)
			int g = sc.nextInt(); // 800미터 달리기(트랙)
			int score = 0;
			
			score += 9.23076 * Math.pow(26.7 - a, 1.835);
			score += 1.84523 * Math.pow(b - 75, 1.348);
			score += 56.0211 * Math.pow(c - 1.5, 1.05);
			score += 4.99087 * Math.pow(42.5 - d, 1.81);
			score += 0.188807 * Math.pow(e - 210, 1.41);
			score += 15.9803 * Math.pow(f - 3.8, 1.04);
			score += 0.11193 * Math.pow(254 - g, 1.88);
			
			System.out.println(score);
		}
		
		sc.close();
	}
}