package boj;
import java.util.*;

public class BOJ18198 { // Basketball One-on-One
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray(); // 문자열을 문자형으로 배열에 입력
		int A = 0;
		int B = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'A') {
				A += arr[i + 1] - '0';
			} else if (arr[i] == 'B') {
				B += arr[i + 1] - '0';
			}
		}
		
		if (A > B) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		sc.close();
	}
}