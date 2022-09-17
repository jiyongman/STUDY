package codeup;
import java.util.*;

public class CODEUP1024 { // 단어 1개 입력받아 나누어 출력하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); 
		
		for (int i = 0; i < str.length(); i++) { // 문자열의 문자를 하나씩 배열에 입력
			System.out.println("'" + str.charAt(i) + "'");
		}
		
		sc.close();
	}
}