package boj;
import java.util.*;

public class BOJ14182 { // Tax
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			
			if (n == 0) {
				break;
			}
			
			if (n >= 1000000 && n <= 5000000) {
				n *= 0.9;
			} else if (n > 5000000) {
				n *= 0.8;
			}
			
			System.out.println(n);
		}
		
		sc.close();
	}
}