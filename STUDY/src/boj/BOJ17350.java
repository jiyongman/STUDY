package boj;
import java.util.*;

public class BOJ17350 { // 2루수 이름이 뭐야
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 야구팀의 멤버 수
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String str = sc.next(); // 선수의 이름
			
			if (str.equals("anj")) {
				cnt++;
			}
		}
		
		if (cnt > 0) {
			System.out.println("뭐야;");
		} else {
			System.out.println("뭐야?");
		}
		
		sc.close();
	}
}