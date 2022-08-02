package boj;
import java.util.*;

public class BOJ21612 { // Boiling Water
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt(); // the temperature in ◦C at which water begins to boil
		int P = 5 * B - 400; // atmospheric pressure measured in kPa
		
		System.out.println(P);
		
		if (P > 100) {
			System.out.println(-1);
		} else if (P < 100) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}
}