package boj;
import java.util.*;

public class BOJ21335 { // Another Eruption
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); // the total area covered by gas in square metres
		double r = Math.sqrt(a / Math.PI);
		double l = 2 * Math.PI * r; // the total length of barrier tape needed to surround the area covered by gas, in metres
		
		System.out.println(l);
		sc.close();
	}
}