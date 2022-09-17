package codeup;
import java.util.*;

public class CODEUP1035 { // 16진 정수 1개 입력받아 8진수로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = Integer.valueOf(str, 16); // 16진수 입력
		
		System.out.println(String.format("%o", a)); // 8진수 출력
		sc.close();
	}
}