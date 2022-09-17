package codeup;
import java.util.*;

public class CODEUP1052 { // 두 정수 입력받아 비교하기4

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a != b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}
}