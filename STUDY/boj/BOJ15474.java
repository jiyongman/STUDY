package boj;
import java.util.*;

public class BOJ15474 { // 鉛筆 (Pencils)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the number of pencils JOI decided to buy
		int A = sc.nextInt(); // the number of pencils set X
		int B = sc.nextInt(); // the cost of pencils set X
		int C = sc.nextInt(); // the number of pencils set Y
		int D = sc.nextInt(); // the cost of pencils set Y
		int X = A * B; // set X
		int Y = C * D; // set Y
		
		if (N % A != 0) {
			X = (N / A + 1) * B;
		} else {
			X = N / A * B;
		}
		
		if (N % C != 0) {
			Y = (N / C + 1) * D;
		} else {
			Y = N / C * D;
		}
		
		System.out.println(Math.min(X, Y));
		sc.close();
	}
}