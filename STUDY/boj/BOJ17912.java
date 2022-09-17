package boj;
import java.util.*;

public class BOJ17912 { // License to Launch
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of days for which the launch license is valid
		int min = 1000000001;
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt(); // the amount of space junk on the i’th day
			
			if (min > d) {
				min = d;
				result = i;
			}
		}
		
		System.out.println(result); // the number of days Birk needs to wait before he launches his rocket
		sc.close();
	}
}