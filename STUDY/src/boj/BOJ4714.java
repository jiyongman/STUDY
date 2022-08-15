package boj;
import java.util.*;

public class BOJ4714 { // Lunacy
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			double X = sc.nextDouble(); // a weight (in pounds) on the Earth
			
			if (X < 0) {
				break;
			}
			
			double Y = X * 0.167; // a weight (in pounds) on the moon
			
			System.out.println("Objects weighing " + String.format("%.2f", X) + " on Earth will weigh " + String.format("%.2f", Y) + " on the moon.");
		}
		
		sc.close();
	}
}