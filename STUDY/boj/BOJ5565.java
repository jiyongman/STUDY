package boj;
import java.util.*;

public class BOJ5565 { // 영수증
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < 9; i++) {
			n -= sc.nextInt();
		}
		
		System.out.println(n);
		sc.close();
	}
}