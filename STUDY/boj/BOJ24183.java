package boj;
import java.util.*;

public class BOJ24183 { // Affischutskicket
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double C4 = sc.nextDouble(); // the types used for the envelope
		double A3 = sc.nextDouble(); // the types used for the posters
		double A4 = sc.nextDouble(); // the types used for the information sheet
		double envelope = 229 * 324 * C4 * 2;
		double posters = 297 * 420 * A3 * 2;
		double sheet = 210 * 297 * A4;
		
		System.out.printf("%.06f", (envelope + posters + sheet) * 0.000001);
		sc.close();
	}
}