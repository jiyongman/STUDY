package codeup;
import java.util.*;

public class CODEUP1041 { // 문자 1개 입력받아 다음 문자 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println((char) (ch + 1));
		sc.close();
	}
}