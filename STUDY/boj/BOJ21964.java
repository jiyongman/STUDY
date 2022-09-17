package boj;
import java.util.*;

public class BOJ21964 { // 선린인터넷고등학교 교가
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 문자열의 길이
		String S = sc.next(); // N글자로 이루어진 문자열
		
		for (int i = N - 5; i < N; i++) {
			char ch = S.charAt(i);
			System.out.print(ch);
		}
		
		sc.close();
	}
}