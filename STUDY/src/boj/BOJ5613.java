package boj;
import java.util.*;

public class BOJ5613 { // 계산기 프로그램
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = a;
		
		while (true) {
			String str = sc.next();
			
			if (str.equals("=")) {
				break;
			}
			
			int b = sc.nextInt();
			
			if (str.equals("+")) {
				result += b;
			} else if (str.equals("-")) {
				result -= b;
			} else if (str.equals("*")) {
				result *= b;
			} else {
				result /= b;
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}