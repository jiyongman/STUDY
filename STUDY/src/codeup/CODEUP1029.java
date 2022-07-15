package codeup;
import java.util.*;

public class CODEUP1029 { // 실수 1개 입력받아 그대로 출력하기2

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		System.out.println(String.format("%.11f", a));
		sc.close();
	}
}