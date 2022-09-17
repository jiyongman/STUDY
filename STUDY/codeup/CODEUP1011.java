package codeup;
import java.util.*;

public class CODEUP1011 { // 문자 1개 입력받아 그대로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0); // 문자 받아오기
		
		System.out.println(ch);
		sc.close();
	}
}