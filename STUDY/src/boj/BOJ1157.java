package boj;
import java.util.*;

public class BOJ1157 { // 단어 공부

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String str = sc.next().toUpperCase(); // 문자열 대문자로 변환
		
		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i) - 65; // 아스키 코드 대문자 값 빼기
			arr[j]++;
		}
		
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
		sc.close();
	}	
}
