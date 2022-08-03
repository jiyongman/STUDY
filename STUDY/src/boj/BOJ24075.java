package boj;
import java.util.*;

public class BOJ24075 { // 計算 (Calculation)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = A + B;
		int Y = A - B;
		
		System.out.println(Math.max(X, Y));
		System.out.println(Math.min(X, Y));
		sc.close();
	}
}