package boj;
import java.util.*;

public class BOJ18698 { // The Walking Adam
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String str = sc.next();
			int cnt = 0;
			
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == 'U') {
					cnt++;
				} else {
					break;
				}
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}
}