package boj;
import java.util.*;

public class BOJ5354 { // J박스
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int S = sc.nextInt(); // 박스의 크기
			
			for (int j = 0; j < S; j++) {
				for (int k = 0; k < S; k++) {
					if (j == 0 || k == 0 || j == S - 1 || k == S - 1) {
						System.out.print("#");
					} else {
						System.out.print("J");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}
}