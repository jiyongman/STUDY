package boj;
import java.util.*;

public class BOJ13528 { // Grass Seed Inc.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double C = sc.nextDouble(); // the cost of seed to sow one square metre of lawn
		double L = sc.nextDouble(); // the number of lawns to sow
		double sum = 0;
		
		for (int i = 0; i < L; i++) {
			double w = sc.nextDouble(); // the width of the lawn
			double l = sc.nextDouble(); // the length of the lawn
			sum += w * l * C;
		}
		
		System.out.println(sum);
		sc.close();
	}
}