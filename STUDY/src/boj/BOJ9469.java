package boj;
import java.util.*;

public class BOJ9469 { // 폰 노이만
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < P; i++) {
			int N = sc.nextInt(); // 테스트 케이스의 번호
			double D = sc.nextDouble(); // 철로의 길이
			double A = sc.nextDouble(); // 기차1의 속도
			double B = sc.nextDouble(); // 기차2의 속도
			double F = sc.nextDouble(); // 파리의 속도
			double X = D / (A + B) * F; // 두 기차가 충돌할 때까지 파리가 움직인 거리
			
			System.out.println(N + " " + X);
		}
		
		sc.close();
	}
}