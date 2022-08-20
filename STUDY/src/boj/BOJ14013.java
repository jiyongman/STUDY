package boj;
import java.util.*;

public class BOJ14013 { // Unit Conversion
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		int N = sc.nextInt(); // the number of conversions to be performed
		
		for (int i = 0; i < N; i++) {
			double z = sc.nextDouble();
			String str = sc.next();
			char q = str.charAt(0);
			
			if (q == 'A') {
				System.out.println(z * y / x);
			} else {
				System.out.println(z * x / y);
			}
		}
		
		sc.close();
	}
}