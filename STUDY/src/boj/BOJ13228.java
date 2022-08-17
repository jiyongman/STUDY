package boj;
import java.util.*;

public class BOJ13228 { // The REAL Manhattan distance
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // the number of test cases
		
		for (int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int floor1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int floor2 = sc.nextInt();
			int d = floor1 + Math.abs(x1 - x2) + Math.abs(y1 - y2) + floor2;
			
			System.out.println(d);
		}
		
		sc.close();
	}
}