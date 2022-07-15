package codeup;
import java.util.*;

public class CODEUP1015 { // 실수 입력받아 둘째 자리까지 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		
		System.out.println(String.format("%.2f", f)); // 소수점 셋째 자리에서 반올림하여 둘째 자리까지 출력
		sc.close();
	}
}