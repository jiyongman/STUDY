package boj;
import java.util.*;

public class BOJ11653 { // 소인수분해

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 2; i <= N; i++) {
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		
		sc.close();
	}
}