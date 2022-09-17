package codeup;
import java.util.*;

public class CODEUP1042 { // 정수 2개 입력받아 나눈 몫 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a / b);
		sc.close();
	}
}