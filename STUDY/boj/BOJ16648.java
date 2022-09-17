package boj;
import java.util.*;

public class BOJ16648 { // Accumulator Battery
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble(); // the time Anna needs to get from her home to the meeting place, in minutes
		double p = sc.nextDouble(); // the battery level of her phone at the moment of meeting, in percent
		double a = t / (100 - p);
		double b = t / ((20 - p) * 2 + 80);
		
		if (p > 20) {
			System.out.println((p - 20) * a + (20 * 2 * a));
		} else {
			System.out.println(p * 2 * b);
		}
		
		sc.close();
	}
}