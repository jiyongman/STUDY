package boj;
import java.util.*;

public class BOJ18409 { // 母音を数える (Counting Vowels)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		char[] arr = str.toCharArray(); // 문자열을 문자형으로 변환하여 입력
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}