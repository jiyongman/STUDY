package codeup;
import java.util.*;

public class CODEUP1033 { // 10진 정수 입력받아 16진수로 출력하기2

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(String.format("%X", a)); // 16진수 대문자
		sc.close();
	}
}