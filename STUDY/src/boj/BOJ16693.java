package boj;
import java.util.*;

public class BOJ16693 { // Pizza Deal
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A1 = sc.nextDouble(); // the area of the pizza slice
		double P1 = sc.nextDouble(); // the price of the pizza slice
		double R1 = sc.nextDouble(); // the radius of the circular pizza
		double P2 = sc.nextDouble(); // the price of the circular pizza
		double X = A1 / P1;
		double Y = Math.PI * R1 * R1 / P2;
		
		if (X < Y) {
			System.out.println("Whole pizza");
		} else {
			System.out.println("Slice of pizza");
		}
		sc.close();
	}
}