package boj;
import java.util.*;

public class BOJ16785 { // ソーシャルゲーム (Social Game)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = 0;
		int sum = 0;
		
		while (true) {
			
			if (sum >= C) {
				break;
			}
			
			N++;
			sum += A;
			
			if (N % 7 == 0) {
				sum += B;
			}
		}
		
		System.out.println(N);
		sc.close();
	}
}