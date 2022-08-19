package boj;
import java.util.*;

public class BOJ5102 { // Sarah's Toys
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt(); // how many stuffed toys she owns at the time
			int b = sc.nextInt(); // the number of toys left round the house that don’t make it back to Sarah’s bedroom that night
			
			if (a == 0 && b == 0) {
				break;
			}
			
			int x = 0;
			int y = 0;
			
			if (a - b < 2) {
				x = 0;
				y = 0;
			} else if((a - b) % 2 > 0) {
				x = (a - b - 2) / 2;
				y = 1;
			} else if((a - b) % 2 == 0) {
				x = (a - b) / 2;
				y = 0;
			}
			
			System.out.println(x + " " + y);
		}
		
		sc.close();
	}
}