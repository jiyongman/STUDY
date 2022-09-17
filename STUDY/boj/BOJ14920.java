package boj;
import java.util.*;

public class BOJ14920 { // 3n + 1 수열

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int cnt = 1;
		
		while (true) {
			
			if (C == 1) {
				break;
			}
			
			if (C % 2 == 0) {
				C /= 2;
			} else {
				C = 3 * C + 1;
			}
			cnt++;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}