package codeup;
import java.util.*;

public class CODEUP1025 { // 정수 1개 입력받아 나누어 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray(); // 문자열을 문자형 배열로 변환
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i]);
			
			for (int j = arr.length - 1; j > i; j--) {
				System.out.print("0");
			}
			
			System.out.println("]");
		}
		
		sc.close();
	}
}