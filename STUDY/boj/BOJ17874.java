package boj;
import java.util.*;

public class BOJ17874 { // Piece of Cake!
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the length of the sides of the square cake in centimeters
		int h = sc.nextInt(); // the distance of the horizontal cut from the top edge of the cake in centimeters
		int v = sc.nextInt(); // the distance of the vertical cut from the left edge of the cake in centimeters
		long V1 = h * v * 4;
		long V2 = (n - h) * v * 4;
		long V3 = h * (n - v) * 4;
		long V4 = (n - h) * (n - v) * 4;
		
		System.out.println(Math.max(V1, Math.max(V2, Math.max(V3, V4))));
		sc.close();
	}
}