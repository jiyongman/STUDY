package boj;
import java.util.*;

public class BOJ20215 { // Cutting Corners
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble(); // the width of the corner
		double h = sc.nextDouble(); // the height of the corner
		double result = w + h - Math.sqrt(w * w + h * h); // how much longer you have to cut if you cut out a rectangle, compared to cutting along the diagonal

		System.out.println(result);
		sc.close();
	}
}