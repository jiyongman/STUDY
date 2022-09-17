package boj;
import java.util.*;

public class BOJ11908 { // 카드
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 카드의 수
		int[] c = new int[n];
		
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		Arrays.sort(c);
		int sum = 0;
		
		for (int i = 0; i < n - 1; i++) {
			sum += c[i];
		}
		
		System.out.println(sum);
		sc.close();
	}
}