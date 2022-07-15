package codeup;
import java.util.*;

public class CODEUP1051 { // 두 정수 입력받아 비교하기3

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b >= a) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}
}