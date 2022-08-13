package boj;
import java.util.*;

public class BOJ14579 { // 덧셈과 곱셈
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = a * (a + 1) / 2;
		int y = x;
		
		for (int i = a + 1; i <= b; i++) {
			y += i;
			x *= y;
			x %= 14579;
			y %= 14579;
		}
		
		System.out.println(x % 14579);
		sc.close();
	}
}