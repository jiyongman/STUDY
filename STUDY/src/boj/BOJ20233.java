package boj;
import java.util.*;

public class BOJ20233 { // Bicycle
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // the monthly fee
		int x = sc.nextInt(); // the first 30 minutes are free, and every minute above that costs
		int b = sc.nextInt(); // the monthly fee
		int y = sc.nextInt(); // the first 45 minutes are free, and every minute above that costs
		int T = sc.nextInt(); // the total time spent on a bicycle during each day
		int d = 21; // working days
		
		if (T > 30) {
			a += (T - 30) * x * d;
		}
		
		if (T > 45) {
			b += (T - 45) * y * d;
		}
		
		System.out.println(a + " " + b);
		sc.close();
	}
}