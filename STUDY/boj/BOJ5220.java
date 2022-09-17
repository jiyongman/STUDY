package boj;
import java.util.*;

public class BOJ5220 { // Error Detection
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); // the 16-bit integer
			int k = sc.nextInt(); // the check bit
			String str = Integer.toBinaryString(n);
			int cnt = 0;
			
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if (ch == '1') {
					cnt++;
				}
			}
			
			if (cnt % 2 > 0 && k == 1) {
				System.out.println("Valid");
			} else if (cnt % 2 > 0 && k == 0) {
				System.out.println("Corrupt");
			} else if (cnt % 2 == 0 && k == 1) {
				System.out.println("Corrupt");
			} else {
				System.out.println("Valid");
			}
		}
		
		sc.close();
	}
}