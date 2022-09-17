package boj;
import java.util.*;

public class BOJ7581 { // Cuboids
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int l = sc.nextInt(); // the length of a cuboid
			int w = sc.nextInt(); // the width of a cuboid
			int h = sc.nextInt(); // the height of a cuboid
			int v = sc.nextInt(); // the volume of a cuboid
			
			if (l == 0 && w == 0 && h == 0 && v == 0) {
				break;
			}
			
			if (l == 0) {
				l = v / (w * h);
			} else if (w == 0) {
				w = v / (l * h);
			} else if (h == 0) {
				h = v / (l * w);
			} else if (v == 0) {
				v = l * w * h;
			}
			
			System.out.println(l + " " + w + " " + h + " " + v);
		}
		
		sc.close();
	}
}