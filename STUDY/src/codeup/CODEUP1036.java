package codeup;
import java.util.*;

public class CODEUP1036 { // 영문자 1개 입력받아 10진수로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println((int) ch);
		sc.close();
	}
}