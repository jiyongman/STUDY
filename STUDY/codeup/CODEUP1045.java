package codeup;
import java.util.*;

public class CODEUP1045 { // 정수 2개 입력받아 자동 계산하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(String.format("%.2f", (float) a / b));
		sc.close();
	}
}