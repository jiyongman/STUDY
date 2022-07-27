package boj;
import java.util.*;

public class BOJ14065 { // Gorivo
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double gal = 3.785411784; // 1 gallon = 3.785411784 liters
		double mi = 1.609344; // 1 mile = 1.609344 kilometers
		double x = sc.nextDouble(); // how many miles per gallon Mirko's car gets
		double result = 100 / (mi / gal * x); // how many liters the car consumes per 100 kilometers
		
		System.out.printf("%.06f", result);
		sc.close();
	}
}