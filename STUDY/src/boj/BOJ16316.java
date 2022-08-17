package boj;
import java.util.*;

public class BOJ16316 { // Baby Bites
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of bites Arild receives
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			
			if (str.equals("mumble")) {
				continue;
			}
			
			if (Integer.parseInt(str) != i) {
				cnt++;
			}
		}
		
		if (cnt == 0) {
			System.out.println("makes sense");
		} else {
			System.out.println("something is fishy");
		}
		
		sc.close();
	}
}