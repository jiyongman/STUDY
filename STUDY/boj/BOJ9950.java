package boj;
import java.util.*;

public class BOJ9950 { // Rectangles
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int l = sc.nextInt(); // the length of a rectangle
			int w = sc.nextInt(); // the width of a rectangle
			int a = sc.nextInt(); // the area of a rectangle
			
			if (l == 0 && w == 0 && a == 0) {
				break;
			}
			
			if (l == 0) {
				l = a / w;
			} else if (w == 0) {
				w = a / l;
			} else if (a == 0) {
				a = l * w;
			}
			
			System.out.println(l + " " + w + " " + a);
		}
		
		sc.close();
	}
}