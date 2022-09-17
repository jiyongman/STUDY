package boj;
import java.util.*;

public class BOJ4696 { // St. Ives
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			double a = sc.nextDouble(); // the numbers of wives, sacks per wife, cats per sack, and kittens per cat that Robert encountered that year
			if (a == 0) {
				break;
			}
			System.out.printf("%.02f", 1 + a + a * a + a * a * a + a * a * a * a);
			System.out.println();
		}
		
		sc.close();
	}
}