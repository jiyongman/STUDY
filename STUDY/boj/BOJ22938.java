package boj;
import java.util.*;

public class BOJ22938 { // 백발백준하는 명사수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long X1 = sc.nextLong(); // 첫 번째 과녁의 중심 X 좌표
		long Y1 = sc.nextLong(); // 첫 번째 과녁의 중심 Y 좌표
		long R1 = sc.nextLong(); // 첫 번째 과녁의 반지름
		long X2 = sc.nextLong(); // 두 번째 과녁의 중심 X 좌표
		long Y2 = sc.nextLong(); // 두 번째 과녁의 중심 Y 좌표
		long R2 = sc.nextLong(); // 두 번째 과녁의 반지름
		double D = Math.sqrt(Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2)); // 첫 번째 과녁의 중심 좌표와 두 번째 과녁의 중심 좌표와의 거리
		
		if (Math.sqrt(Math.pow(R1 + R2, 2)) > D) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}