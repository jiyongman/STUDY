package boj;
import java.util.*;

public class BOJ23375 { // Arm Coordination
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // the coordinates of the center of the circle
		int y = sc.nextInt(); // the coordinates of the center of the circle
		int r = sc.nextInt(); // the radius of the circle
		
		System.out.println((x + r) + " " + (y + r));
		System.out.println((x + r) + " " + (y - r));
		System.out.println((x - r) + " " + (y - r));
		System.out.println((x - r) + " " + (y + r));
		sc.close();
	}
}