package boj;
import java.util.*;

public class BOJ24365 { // ПЧЕЛИЧКАТА МАЯ
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // the number of bees on the left flower
		int B = sc.nextInt(); // the number of bees on the middle flower
		int C = sc.nextInt(); // the number of bees on the right flower
		int avg = (A + B + C) / 3;
		
		System.out.println((C - avg) + (avg - A));
		sc.close();
	}
}