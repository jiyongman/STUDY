package codeup;
import java.util.*;

public class CODEUP1034 { // 8진 정수 1개 입력받아 10진수로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = Integer.valueOf(str, 8); // 8진수 입력
		
		System.out.println(a);
		sc.close();
	}
}