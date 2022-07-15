package boj;
import java.util.*;

public class BOJ1333 { // 부재중 전화

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 노래 곡 수
		int L = sc.nextInt(); // 노래의 길이
		int D = sc.nextInt(); // 전화벨 (D초에 1번 1초간)
		boolean[] bl = new boolean[N * L + 5 * (N - 1)];
		int result = 0;
		
		for (int i = 0; i < N; i++) { // 노래가 재생되는 시간
			int a = (L + 5) * i; 
			for (int j = a; j < a + L; j++) {
				bl[j] = true;
			}
		}
		
		while (result < bl.length) {
			if (!bl[result]) { // 노래가 나오고 있지 않은 상황 
				break;
			} else { // 노래가 나오고 있는 상황
				result += D; 
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}