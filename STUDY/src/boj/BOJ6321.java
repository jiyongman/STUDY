package boj;
import java.util.*;

public class BOJ6321 { // IBM 빼기 1
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 컴퓨터의 개수
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println("String #" + (i + 1));
			
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == 'Z') {
					ch = 'A';
				} else {
					ch += 1;
				}
				System.out.print(ch);
			}
			System.out.println();
			System.out.println();
		}
		
		sc.close();
	}
}