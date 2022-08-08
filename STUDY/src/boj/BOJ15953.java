package boj;
import java.util.*;

public class BOJ15953 { // 상금 헌터
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int reward = 0;
			int reward2 = 0;
			
			if (a > 0) {
				if (a <= 1) {
					reward = 5000000;
				} else if (a <= 3) {
					reward = 3000000;
				} else if (a <= 6) {
					reward = 2000000;
				} else if (a <= 10) {
					reward = 500000;
				} else if (a <= 15) {
					reward = 300000;
				} else if (a <= 21) {
					reward = 100000;
				}
			}
			if (b > 0) {
				if (b <= 1) {
					reward2 = 5120000;
				} else if (b <= 3) {
					reward2 = 2560000;
				} else if (b <= 7) {
					reward2 = 1280000;
				} else if (b <= 15) {
					reward2 = 640000;
				} else if (b <= 31) {
					reward2 = 320000;
				}
			}
			
			System.out.println(reward + reward2);
		}
		
		sc.close();
	}
}