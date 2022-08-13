package boj;
import java.util.*;

public class BOJ4619 { // 루트
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int B = sc.nextInt();
			int N = sc.nextInt();
			int A = 0;
			int num = 0;
			int num2 = 0;
			
			if (B == 0 && N == 0) {
				break;
			}
			
			while (true) {
				if (Math.pow(A, N) <= B) {
					num = A;
				} else {
					num2 = A;
					break;
				}
				A++;
			}
			
			if (B - Math.pow(num, N) <= Math.pow(num2, N) - B) {
				System.out.println(num);
			} else {
				System.out.println(num2);
			}
		}
		
		sc.close();
	}
}