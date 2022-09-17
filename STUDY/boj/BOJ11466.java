package boj;
import java.util.*;

public class BOJ11466 { // Alex Origami Squares
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble(); // the height of the sheet of paper
		double w = sc.nextDouble(); // the width of the sheet of paper
		double result = 0; // the maximum possible length of the square side
		
		if (h < w) {
			double tmp = h;
			h = w;
			w = tmp;
		}
		
		if (h > w * 3) {
			result = w;
		} else if (h > w * 1.5) {
			result = h / 3;
		} else {
			result = w / 2;
		}
		
		System.out.println(result);
		sc.close();
	}
}