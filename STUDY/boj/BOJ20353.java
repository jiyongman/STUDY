package boj;
import java.util.*;

public class BOJ20353 { // Atrium

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); // the area in square meters of the Atrium
		double l = 4 * Math.sqrt(a); // the total length of walling needed for the atrium, in metres
		
		System.out.println(l);
		sc.close();
	}
}