package boj;
import java.util.*;

public class BOJ20674 { // Statistics

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of the coming days
		int sum = 0;
		int min = 1001;
		
		for (int i = 0; i < n; i++) {
			int pi = sc.nextInt();
			
			if (pi == Math.min(min, pi)) {
				min = pi;
			} else {
				sum += pi - min;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}