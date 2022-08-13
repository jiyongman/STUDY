package boj;
import java.util.*;

public class BOJ2712 { // 미국 스타일
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0 ; i < T; i++) {
			double A = sc.nextDouble(); // 값
			String str = sc.next(); // 단위
			
			if (str.equals("kg")) {
				System.out.printf("%.4f lb\n", A * 2.2046);
			} else if (str.equals("lb")) {
				System.out.printf("%.4f kg\n", A * 0.4536);
			} else if (str.equals("l")) {
				System.out.printf("%.4f g\n", A * 0.2642);
			} else {
				System.out.printf("%.4f l\n", A * 3.7854);
			}
		}
		
		sc.close();
	}
}