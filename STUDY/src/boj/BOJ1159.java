package boj;
import java.util.*;

public class BOJ1159 { // 농구 경기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[26];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			char ch = str.charAt(0);
			arr[ch - 97]++; // 아스키 코드 소문자 값 빼기
		}
		
		boolean bl = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5) {
				bl = true;
				System.out.print((char) (i + 97)); // 소문자로 출력
			}
		}
		
		if (!bl) {
			System.out.println("PREDAJA");
		}
		
		sc.close();
	}
}
