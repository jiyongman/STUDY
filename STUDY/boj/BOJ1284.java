package boj;
import java.util.*;

public class BOJ1284 { // 집 주소

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.next();
			int cnt = 0;
			if (str.equals("0")) { // 입력값이 0이면 while문 종료
				break;
			}
			
			for (int i = 0; i < str.length(); i++) { // 문자에 여백 포함하여 cnt
				if (str.charAt(i) == '1') { 
					cnt += 3;
				} else if (str.charAt(i) == '0') { 
					cnt += 5;
				} else {
					cnt += 4;
				}
			}
			
			System.out.println(cnt + 1); // 마지막 여백 cnt
		}
		
		sc.close();
	}
}