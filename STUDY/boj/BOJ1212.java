package boj;
import java.util.*;

public class BOJ1212 { // 8진수 2진수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i)-'0'; // 문자형을 정수형으로
			
			if (i == 0 && j < 4) {
				if (j < 2) {
					sb.append(arr[j].substring(2)); // 앞의 두 자리 자르기
				} else {
					sb.append(arr[j].substring(1)); // 앞의 한 자리 자르기
				}
			} else {
				sb.append(arr[j]);
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
}