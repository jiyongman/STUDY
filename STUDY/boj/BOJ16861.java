package boj;
import java.util.*;

public class BOJ16861 { // Harshad Numbers
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (true) {
			int num = n;
			int sum = 0;
			
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
		
			if (n % sum == 0) {
				System.out.println(n);
				break;
			}
			
			n++;
		}
		
		sc.close();
	}
}