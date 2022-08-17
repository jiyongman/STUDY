package boj;
import java.util.*;

public class BOJ5074 { // When Do We Finish?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String[] arr = sc.next().split(":");
			String[] arr2 = sc.next().split(":");
			int h1 = Integer.parseInt(arr[0]);
			int m1 = Integer.parseInt(arr[1]);
			int h2 = Integer.parseInt(arr2[0]);
			int m2 = Integer.parseInt(arr2[1]);
			
			if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
				break;
			}
			
			int h = h1 + h2;
			int m = m1 + m2;
			int n = 0;
			
			if (m >= 60) {
				h += m / 60;
				m %= 60;
			}
			
			if (h >= 24) {
				n += h / 24;
				h %= 24;
			}
			
			if (n > 0) {
				System.out.printf("%02d:%02d +%d\n", h, m, n);
			} else {
				System.out.printf("%02d:%02d\n", h, m);
			}
		}
		
		sc.close();
	}
}