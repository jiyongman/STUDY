package boj;
import java.util.*;

public class BOJ24623 { // Изгороди

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = sc.nextDouble(); // the value of the angle between the ditches in degrees
		double x = (180 - a) / 2;
		double y = a / 2;
		
		System.out.println((int) Math.round(x + y));
		sc.close();
	}
}