package boj;
import java.util.*;

public class BOJ2744 { // 대소문자 바꾸기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray(); // 문자열을 문자 배열로
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i] >= 65 && arr[i] <= 90) { // arr[i] >= 'A' && arr[i] <= 'Z'
				arr[i] = (char) (arr[i] + 32);
			} else if (arr[i] >= 97 && arr[i] <= 122) { // arr[i] >= 'a' && arr[i] <= 'z'
				arr[i] = (char) (arr[i] - 32);
			}
		
		System.out.println(arr);
		sc.close();
	}
}