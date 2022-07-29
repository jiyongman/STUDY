package boj;
import java.util.*;

public class BOJ15610 { // Abbey Courtyard

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); // the area in square metres of the yard
		double b = Math.sqrt(a) * 4;
		
		System.out.println(b);
		sc.close();
	}
}