package boj;
import java.util.*;

public class BOJ25286 { // 11월 11일
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 계산해야 하는 날짜의 수
		int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < T; i++) {
			int yi = sc.nextInt(); // 연도
			int mi = sc.nextInt(); // 달
			int di = 0; // 일
			
			if (mi == 1) {
				System.out.println((yi - 1) + " " + 12 + " " + 31);
			} else {
				if (mi == 3 && yi % 4 == 0 && (yi % 100 != 0 || yi % 400 == 0)) {
					mi -= 1;
					di = 29;
				} else {
					mi -= 1;
					di = arr[mi];
				}
				System.out.println(yi + " " + mi + " " + di);
			}
		}
		
		sc.close();
	}
}