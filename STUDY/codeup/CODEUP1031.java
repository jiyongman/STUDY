package codeup;
import java.util.*;

public class CODEUP1031 { // 10진 정수 1개 입력받아 8진수로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(String.format("%o", a));
		sc.close();
	}
}