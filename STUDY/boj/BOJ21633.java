package boj;
import java.util.*;

public class BOJ21633 { // Bank Transfer
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble(); // the tugriks that Tanya is planning to transfer Vanya  
		double c = k * 0.01 + 25; // the commission for the transfer
		
		if (c <= 100) {
			System.out.printf("%.02f", 100.00);
		} else if (c >= 2000) {
			System.out.printf("%.02f", 2000.00);
		} else {
			System.out.printf("%.02f", c);
		}
		
		sc.close();
	}
}