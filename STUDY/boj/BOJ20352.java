package boj;
import java.util.*;

public class BOJ20352 { // Circus
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); // the area of the circus tent in square metres
		double l = 2 * Math.PI * Math.sqrt(a / Math.PI); // the total length of fence needed for the circus palisade wall, in metres
		
		System.out.println(l);
		sc.close();
	}
}