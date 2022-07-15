package codeup;
import java.util.*;

public class CODEUP1014 { // 문자 2개 입력받아 순서 바꿔 출력하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		
		System.out.println(ch2 + " " + ch1);
		sc.close();
	}
}