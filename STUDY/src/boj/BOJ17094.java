package boj;
import java.util.*;

public class BOJ17094 { // Serious Problem
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 문자열 s의 길이
		String s = sc.next(); // 문자열
		int cnt = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			
			if (ch == '2') {
				cnt++;
			} else {
				cnt2++;
			}
		}
		
		if (cnt > cnt2) {
			System.out.println("2");
		} else if (cnt < cnt2) {
			System.out.println("e");
		} else {
			System.out.println("yee");
		}
		
		sc.close();
	}
}