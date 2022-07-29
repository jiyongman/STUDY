package boj;
import java.util.*;

public class BOJ16600 { // Contemporary Art
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); // the area of the image in square centimetres
		double b = Math.sqrt(a) * 4; // the total length of filament needed for the frame
		
		System.out.println(b);
		sc.close();
	}
}