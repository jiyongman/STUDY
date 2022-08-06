package boj;
import java.util.*;

public class BOJ2490 { // 윷놀이
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			
			for (int j = 0; j < 4; j++) {
				arr[j] = sc.nextInt();
				if (arr[j] == 1) {
					cnt++;
				}
			}
			
			if (cnt == 0) {
				System.out.println("D"); // 윷
			} else if (cnt == 1) {
				System.out.println("C"); // 걸
			} else if (cnt == 2) {
				System.out.println("B"); // 개
			} else if (cnt == 3) {
				System.out.println("A"); // 도
			} else {
				System.out.println("E"); // 모
			}
		}
		
		sc.close();
	}
}