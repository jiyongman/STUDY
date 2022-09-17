package boj;
import java.util.*;

public class BOJ10809 { // 알파벳 찾기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
        String S = sc.next();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int j = 0; j < S.length(); j++) {
			char ch = S.charAt(j);
			if (arr[ch - 97] == -1) {
				arr[ch - 97] = j;
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		sc.close();
	}
}