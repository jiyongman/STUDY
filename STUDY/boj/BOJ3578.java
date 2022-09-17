package boj;
import java.util.*;

public class BOJ3578 { // Holes
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // the number of holes
		
		if (h == 0) {
			System.out.println(1);
		} else if (h == 1) {
			System.out.println(0);
		} else if (h == 2) {
			System.out.println(8);
		} else {
			if (h % 2 > 0) {
				System.out.print(4);
			}
			for (int i = 0; i < h / 2; i++) {
				System.out.print(8);
			}
		}
		
		sc.close();
	}
}