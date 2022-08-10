package boj;
import java.util.*;

public class BOJ4493 { // 가위 바위 보?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); // 가위 바위 보를 한 횟수
			int cnt = 0;
			
			for (int j = 0; j < n; j++) {
				String str = sc.next();
				String str2 = sc.next();
				
				if (str.equals("R") && str2.equals("S")) {
					cnt++;
				} else if (str.equals("S") && str2.equals("P")) {
					cnt++;
				} else if (str.equals("P") && str2.equals("R")) {
					cnt++;
				} else if (str.equals("R") && str2.equals("P")) {
					cnt--;
				} else if (str.equals("S") && str2.equals("R")) {
					cnt--;
				} else if (str.equals("P") && str2.equals("S")) {
					cnt--;
				}
			}
			
			if (cnt > 0) {
				System.out.println("Player 1");
			} else if (cnt < 0) {
				System.out.println("Player 2");
			} else {
				System.out.println("TIE");				
			}
		}
		
		sc.close();
	}
}