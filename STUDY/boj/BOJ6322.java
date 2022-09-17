package boj;
import java.util.*;

public class BOJ6322 { // 직각 삼각형의 두 변
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while (true) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			
			System.out.println("Triangle #" + cnt);

			if (a == -1) {
				a = Math.sqrt(c * c - b * b);
				
				if (a + b > c) {
					System.out.println("a = " + String.format("%.3f", a));
				} else {
					System.out.println("Impossible.");
				}
			} else if (b == -1) {
				b = Math.sqrt(c * c - a * a);
				
				if (a + b > c) {
					System.out.println("b = " + String.format("%.3f", b));
				} else {
					System.out.println("Impossible.");
				}
			} else if (c == -1) {
				c = Math.sqrt(a * a + b * b);
				
				if (a + b > c) {
					System.out.println("c = " + String.format("%.3f", c));
				} else {
					System.out.println("Impossible.");
				}
			}
			
			System.out.println();
			cnt++;
		}
		
		sc.close();
	}
}