package boj;
import java.util.*;

public class BOJ24294 { // ГРАДИНА
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int w1 = sc.nextInt(); // the width on the first right-hand side
		int h1 = sc.nextInt(); // the height on the first right-hand side
		int w2 = sc.nextInt(); // the width on the second right-hand side
		int h2 = sc.nextInt(); // the height on the second right-hand side
		
		System.out.println(2 * Math.max(w1, w2) + 2 * (h1 + h2) + 4);
		sc.close();
	}
}