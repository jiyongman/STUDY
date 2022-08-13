package boj;
import java.util.*;

public class BOJ5666 { // Hot Dogs
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			double H = sc.nextDouble(); // the total number of hot dogs consumed
			double P = sc.nextDouble(); // the total number of participants in the contest
			
			System.out.printf("%.2f\n", H / P);
		}
		
		sc.close();
	}
}