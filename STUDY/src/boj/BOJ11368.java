package boj;
import java.util.*;

public class BOJ11368 { // A Serious Reading Problem
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int C = sc.nextInt(); // possible characters
			int W = sc.nextInt(); // characters in a line
			int L = sc.nextInt(); // lines on a page
			int P = sc.nextInt(); // pages in a book
			
			if (C == 0 && W == 0 && L == 0 && P == 0) {
				break;
			}
			
			double N = Math.pow(C, W * L * P); // the number of books in the library
			System.out.println((int) N);
		}
		
		sc.close();
	}
}