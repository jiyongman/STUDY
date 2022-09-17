package boj;
import java.util.*;

public class BOJ21866 { // 추첨을 통해 커피를 받자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max = 100;
		int cnt = 0;
		
		for (int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			sum += a;
			
			if (i > 0 && i % 2 == 0) {
				max += 100;
			}
			
			if (a > max) {
				cnt++;
			}
		}
		
		if (cnt > 0) {
			System.out.println("hacker");
		} else if (sum >= 100) {
			System.out.println("draw");
		} else {
			System.out.println("none");
		}
		
		sc.close();
	}
}