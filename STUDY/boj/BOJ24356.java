package boj;
import java.util.*;

public class BOJ24356 { // ЧАСОВНИК
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt(); // the hours of departure time
		int m1 = sc.nextInt(); // the minutes of departure time
		int t2 = sc.nextInt(); // the hours of arrival time
		int m2 = sc.nextInt(); // the minutes of arrival time
		m1 += t1 * 60;
		m2 += t2 * 60;
		
		if (m1 > m2) {
			m2 += 24 * 60;
		}
		
		System.out.print(m2 - m1 + " " + (m2 - m1) / 30);
		sc.close();
	}
}