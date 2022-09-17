package boj;
import java.util.*;

public class BOJ14545 { // Square
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); // the number of cases
		
		for (int i = 0; i < P; i++) {
			long l = sc.nextLong(); // the grid square length
			long s = l * (l + 1) * (2 * l + 1) / 6; // the total number of squares which can be seen in an image of a grid square of length l
			
			System.out.println(s);
		}
		
		sc.close();
	}
}