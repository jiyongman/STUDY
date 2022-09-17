package boj;
import java.util.*;

public class BOJ4504 { // 배수 찾기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (true) {
			int a = sc.nextInt();
			
			if (a == 0) {
				break;
			}
			
			if (a % n == 0) {
				System.out.println(a + " is a multiple of " + n + ".");
			} else {
				System.out.println(a + " is NOT a multiple of " + n + ".");
			}
		}
		
		sc.close();
	}
}