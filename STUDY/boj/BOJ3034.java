package boj;
import java.util.*;

public class BOJ3034 { // 앵그리 창영
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 던진 성냥의 개수
		int W = sc.nextInt(); // 박스의 가로 크기
		int H = sc.nextInt(); // 박스의 세로 크기
		
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt(); // 성냥의 길이
			
			if (W * W + H * H >= L * L) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		
		sc.close();
	}
}