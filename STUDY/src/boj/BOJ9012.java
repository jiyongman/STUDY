package boj;
import java.util.*;

public class BOJ9012 { // 괄호
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			System.out.println(solution(sc.next()));
		}
		
		sc.close();
	}
	
	public static String solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == '(') { // 여는 괄호인 경우
				stack.push(ch);
			} else if (stack.empty()) { // 스택이 비어있는 경우
				return "NO";
			} else {
				stack.pop();
			}
		}
		
		if (stack.empty()) { // 스택이 비어있는 경우
			return "YES";
		} else {
			return "NO";
		}
	}
}