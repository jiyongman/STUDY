package boj;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ5988 { // 홀수일까 짝수일까
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			BigInteger K = sc.nextBigInteger();
			
			if (K.remainder(BigInteger.valueOf(2)) != BigInteger.valueOf(0)) {
				System.out.println("odd");
			} else {
				System.out.println("even");
			}
		}
		
		sc.close();
	}
}