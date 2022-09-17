package boj;
import java.util.*;

public class BOJ9622 { // Cabin Baggage
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // the number of test cases
		int cnt = 0;
		
		for (int i = 0; i < t; i++) {
			double a = sc.nextDouble(); // the length of cabin baggage
			double b = sc.nextDouble(); // the width of cabin baggage
			double c = sc.nextDouble(); // the depth of cabin baggage
			double d = sc.nextDouble(); // the weight of cabin baggage
			
			if ((a <= 56 && b <= 45 && c <= 25 || a + b + c <= 125) && d <= 7) {
				System.out.println(1);
				cnt++;
			} else {
				System.out.println(0);
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}