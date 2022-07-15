package codeup;
import java.util.*;

public class CODEUP1048 { // 한 번에 2의 거듭제곱 배로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a << b); // 2^b만큼 곱해서 출력
		sc.close();
	}
}