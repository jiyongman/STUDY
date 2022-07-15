package codeup;
import java.util.*;

public class CODEUP1012 { // 실수 1개 입력받아 그대로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		
		System.out.println(String.format("%.6f", f)); // 소수점 6번째 자리까지 출력
		sc.close();
	}
}