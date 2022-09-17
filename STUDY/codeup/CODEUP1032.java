package codeup;
import java.util.*;

public class CODEUP1032 { // 10진 정수 입력받아 16진수로 출력하기1

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(String.format("%x", a)); // 16진수 소문자
		sc.close();
	}
}