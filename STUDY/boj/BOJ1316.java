package boj;
import java.util.*;

public class BOJ1316 { // 그룹 단어 체커
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			if (bl() == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
	
	public static boolean bl() {
		
		boolean[] bl = new boolean[26];
		String str = sc.next();
		int prev = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); // 현재 문자 입력
			if (prev != now) { // 이전 문자와 현재 문자가 다르다면
				if (bl[now - 'a'] == false) { // 현재 문자가 처음 나오는 경우
					bl[now - 'a'] = true;
					prev = now;
				} else { // 현재 문자가 이미 나온 경우
					return false;
				}
			} else { // 이전 문자와 현재 문자가 같다면
				continue;
			}
		}
		return true;
	}
}