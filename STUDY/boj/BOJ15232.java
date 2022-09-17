package boj;
import java.util.*;

public class BOJ15232 { // Rectangles
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(); // the number of lines to print
		int C = sc.nextInt(); // the number of asterisks to print in each line
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}