package boj;
import java.util.*;

public class BOJ4999 { // 아!

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		
		if (str.length() >= str2.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
		
		sc.close();
	}
}