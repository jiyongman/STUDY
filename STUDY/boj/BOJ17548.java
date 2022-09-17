package boj;
import java.util.*;

public class BOJ17548 { // Greetings!
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'e') {
				cnt++;
			}
		}
		
		System.out.print("h");
		
		for (int i = 0; i < 2 * cnt; i++) {
			System.out.print("e");
		}
		
		System.out.print("y");
		sc.close();
	}
}