package boj;
import java.util.*;

public class BOJ24087 { // アイスクリーム (Ice Cream)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // the height of the ice cream tower you want
		int A = sc.nextInt(); // the height of the base ice cream
		int B = sc.nextInt(); // the height of the increased ice cream tower
		
		if (S <= A) {
			System.out.println(250);
		} else if ((S - A) % B == 0) {
			System.out.println(250 + 100 * ((S - A) / B));
		} else {
			System.out.println(250 + 100 * ((S - A) / B + 1));
		}
		
		sc.close();
	}
}