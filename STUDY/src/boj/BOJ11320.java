package boj;
import java.util.*;

public class BOJ11320 { // 삼각 무늬 - 1
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			double A = sc.nextDouble(); // 한 변의 길이가 A인 정삼각형
			double B = sc.nextDouble(); // 한 변의 길이가 B인 정삼각형
			
			System.out.println((int) Math.ceil((A * A) / (B * B)));
		}
		
		sc.close();
	}
}