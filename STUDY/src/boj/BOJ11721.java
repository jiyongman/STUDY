package boj;
import java.util.*;

public class BOJ11721 { // 열 개씩 끊어 출력하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}