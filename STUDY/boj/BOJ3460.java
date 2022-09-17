package boj;
import java.util.*;

public class BOJ3460 { // 이진수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 십진수
			String str = Integer.toBinaryString(N); // 정수형 십진수를 문자열 이진수로 변환
			
			for (int j = str.length() - 1; j >= 0; j--) { // 자리수가 낮은 것부터
				if (str.charAt(j) == '1') {
					System.out.print(str.length() - j - 1 + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}