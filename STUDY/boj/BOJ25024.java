package boj;
import java.util.*;

public class BOJ25024 { // 시간과 날짜
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			
			if (x < 24 && y < 60) {
				System.out.print("Yes ");
			} else {
				System.out.print("No ");
			}
			
			if ((x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) && y >= 1 && y <= 31) {
				System.out.print("Yes");
			} else if ((x == 4 || x == 6 || x == 9 || x == 11) && y >= 1 && y <= 30) {
				System.out.print("Yes");
			} else if (x == 2 && y >= 1 && y <= 29) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
			
			System.out.println();
 		}
		
		sc.close();
	}
}