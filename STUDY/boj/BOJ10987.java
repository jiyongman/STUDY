package boj;
import java.util.*;

public class BOJ10987 { // 모음의 개수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = new char[str.length()];
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}