package boj;
import java.util.*;

public class BOJ21591 { // Laptop Sticker
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int wc = sc.nextInt(); // the width of your new laptop computer
		int hc = sc.nextInt(); // the height of your new laptop computer
		int ws = sc.nextInt(); // the width of the laptop sticker
		int hs = sc.nextInt(); // the height of the laptop sticker
		
		if (wc - ws > 1 && hc - hs > 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}
}