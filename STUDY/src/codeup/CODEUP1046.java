package codeup;
import java.util.*;

public class CODEUP1046 { // 정수 3개 입력받아 합과 평균 출력하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		
		System.out.println(sum);
		System.out.println(String.format("%.1f", (float) sum / 3));
		sc.close();
	}
}