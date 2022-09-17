package codeup;
import java.util.*;

public class CODEUP1037 { // 정수 입력받아 아스키 문자로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println((char) a);
		sc.close();
	}
}