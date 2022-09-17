package boj;
import java.util.*;

public class BOJ1259 { // 팰린드롬수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.next();
			if (str.equals("0")) { // "0" 입력 시 while문 탈출
				break;
			}
		
			boolean bl = true;
		
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					bl = false;
					break;
				}
			}

			if (bl == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		sc.close();
	}
}