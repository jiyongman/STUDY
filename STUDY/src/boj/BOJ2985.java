package boj;
import java.util.*;

public class BOJ2985 { // 세 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a + b == c) {
			System.out.println(a + "+" + b + "=" + c);
		} else if (a - b == c) {
			System.out.println(a + "-" + b + "=" + c);
		} else if (a * b == c ) {
			System.out.println(a + "*" + b + "=" + c);
		} else if (a / b == c) {
			System.out.println(a + "/" + b + "=" + c);
		} else if (a == b + c) {
			System.out.println(a + "=" + b + "+" + c);
		} else if (a == b - c) {
			System.out.println(a + "=" + b + "-" + c);
		} else if (a == b * c) {
			System.out.println(a + "=" + b + "*" + c);
		} else {
			System.out.println(a + "=" + b + "/" + c);
		}
		
		sc.close();
	}
}