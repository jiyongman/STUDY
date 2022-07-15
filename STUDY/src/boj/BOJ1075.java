package boj;
import java.util.*;

public class BOJ1075 { // 나누기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		N = N / 100 * 100;
		
		while (true) {
			if (N % F == 0) {
				N %= 100;
				if (N < 10) {
					System.out.println("0" + N);
				} else {
					System.out.println(N);
				}
				break;
			}
			N++;
		}
		
		sc.close();
	}
}