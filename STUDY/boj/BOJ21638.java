package boj;
import java.util.*;

public class BOJ21638 { // SMS from MCHS
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt(); // the temperature for today
		int v1 = sc.nextInt(); // the wind speed for today
		int t2 = sc.nextInt(); // the temperature for tomorrow
		int v2 = sc.nextInt(); // the wind speed for tomorrow
		
		if (t2 < 0 && v2 >= 10) {
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		} else if (t2 < t1) {
			System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		} else if (v2 > v1) {
			System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		} else {
			System.out.println("No message");
		}
		
		sc.close();
	}
}