package boj;
import java.util.*;

public class BOJ9724 { // Perfect Cube
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int x = 1; x <= T; x++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int cnt = 0;
			
			System.out.print("Case #" + x + ": ");
			
			for (int y = 1; y <= 1260; y++) {
				int n = y * y * y;
				
				if (n >= A && n <= B) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}